package sabio.impl;

import java.util.List;

import dao.DAOFactory;
import dao.spec.IAtendenteDAO;
import sabio.SABioException;
import sabio.spec.IAtendente;
import vo.AtendenteVO;

public class Atendente implements IAtendente {

    public void delete(String login) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IAtendenteDAO dao = factory.getAtendenteDAO();
            AtendenteVO user = getAtendenteByLogin(login);
            dao.delete(user);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public void create(AtendenteVO vo) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IAtendenteDAO dao = factory.getAtendenteDAO();
            dao.insert(vo);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public void update(AtendenteVO vo) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IAtendenteDAO dao = factory.getAtendenteDAO();
            dao.update(vo);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public AtendenteVO getAtendenteByLogin(String login) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IAtendenteDAO dao = factory.getAtendenteDAO();
            return (AtendenteVO) dao.SelectByLogin(login);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public List getAll() throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IAtendenteDAO dao = factory.getAtendenteDAO();
            return dao.selectAll();
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }
}