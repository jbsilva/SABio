package sabio.impl;

import dao.DAOException;
import dao.DAOFactory;
import dao.spec.IUsuarioDAO;
import java.util.List;
import sabio.SABioException;
import sabio.spec.IUsuario;
import vo.UsuarioVO;

public class Usuario implements IUsuario {

    @Override
    public void delete(String login) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try
        {
            IUsuarioDAO dao = factory.getUsuarioDAO();
            UsuarioVO user = getUsuarioByLogin(login);
            dao.delete(user);
        } catch (DAOException | SABioException e) {
            throw new SABioException(e);
        }
    }

    @Override
    public void create(UsuarioVO user) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IUsuarioDAO dao = factory.getUsuarioDAO();
            dao.insert(user);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    @Override
    public void update(UsuarioVO user) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IUsuarioDAO dao = factory.getUsuarioDAO();
            dao.update(user);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    @Override
    public List getAll() throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IUsuarioDAO dao = factory.getUsuarioDAO();
            return dao.selectAll();
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    @Override
    public UsuarioVO getUsuarioByLogin(String login) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IUsuarioDAO dao = factory.getUsuarioDAO();
            return (UsuarioVO) dao.selectByLogin(login);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    @Override
    public boolean authenticate(UsuarioVO user) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IUsuarioDAO dao = factory.getUsuarioDAO();
            return dao.checkLoginSenha(user.getLogin(), user.getSenha());
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }
}