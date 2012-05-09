package sabio.impl;

import java.util.List;

import dao.DAOFactory;
import dao.spec.IClienteDAO;
import sabio.SABioException;
import sabio.spec.ICliente;
import vo.ClienteVO;

public class Cliente implements ICliente {

    public void delete(String login) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IClienteDAO dao = factory.getClienteDAO();
            ClienteVO user = getClienteByLogin(login);
            dao.delete(user);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public void create(ClienteVO vo) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IClienteDAO dao = factory.getClienteDAO();
            dao.insert(vo);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public void update(ClienteVO vo) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IClienteDAO dao = factory.getClienteDAO();
            dao.update(vo);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public List getAll() throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IClienteDAO dao = factory.getClienteDAO();
            return dao.selectAll();
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

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