package sabio.impl;

import java.util.List;

import dao.DAOFactory;
import dao.spec.IUsuarioDAO;
import sabio.SABioException;
import sabio.spec.IUsuario;
import vo.UsuarioVO;

public class Usuario implements IUsuario {

    public void delete(String login) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try
        {
            IUsuarioDAO dao = factory.getUsuarioDAO();
            UsuarioVO user = getUsuario(login);
            dao.delete(user);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public void create(UsuarioVO user) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IUsuarioDAO dao = factory.getUsuarioDAO();
            dao.insert(user);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public void update(UsuarioVO user) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IUsuarioDAO dao = factory.getUsuarioDAO();
            dao.update(user);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public List getAll() throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IUsuarioDAO dao = factory.getUsuarioDAO();
            return dao.selectAll();
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public UsuarioVO getUsuarioByLogin(String login) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IUsuarioDAO dao = factory.getUsuarioDAO();
            return (UsuarioVO) dao.selectByLogin(login);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public boolean authenticate(UsuarioVO user) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IUsuarioDAO dao = factory.getUsuarioDAO();
            return dao.checkLoginSenha(user.getLogin(), user.getSenha());
        } catch (Exception e) {
            e.printStackTrace();
            throw new SABioException(e);
        }
    }
}