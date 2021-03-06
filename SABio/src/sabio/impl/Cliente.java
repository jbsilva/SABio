package sabio.impl;

import dao.DAOException;
import java.util.List;

import dao.DAOFactory;
import dao.spec.IClienteDAO;
import sabio.SABioException;
import sabio.spec.ICliente;
import vo.ClienteVO;

public class Cliente implements ICliente {

    @Override
    public void delete(String login) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IClienteDAO dao = factory.getClienteDAO();
            ClienteVO user = getClienteByLogin(login);
            dao.delete(user);
        } catch (DAOException | SABioException e) {
            throw new SABioException(e);
        }
    }

    @Override
    public void create(ClienteVO vo) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IClienteDAO dao = factory.getClienteDAO();
            dao.insert(vo);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    @Override
    public void update(ClienteVO vo) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IClienteDAO dao = factory.getClienteDAO();
            dao.update(vo);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    
    @Override
    public List<ClienteVO> getAll() throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IClienteDAO dao = factory.getClienteDAO();
            return dao.SelectAll();
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    @Override
    public ClienteVO getClienteByLogin(String login) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IClienteDAO dao = factory.getClienteDAO();
            return (ClienteVO) dao.SelectByLogin(login);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }
}