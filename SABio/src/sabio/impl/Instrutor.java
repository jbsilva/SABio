package sabio.impl;

import java.util.List;

import dao.DAOFactory;
import dao.spec.IInstrutorDAO;
import sabio.SABioException;
import sabio.spec.IInstrutor;
import vo.InstrutorVO;

public class Instrutor implements IInstrutor {

    public void delete(String login) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try
        {
            IInstrutorDAO dao = factory.getInstrutorDAO();
            InstrutorVO instrutor = getInstrutor(login);
            dao.delete(instrutor);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public void create(InstrutorVO instrutor) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IInstrutorDAO dao = factory.getInstrutorDAO();
            dao.insert(user);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public void update(InstrutorVO instrutor) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IInstrutorDAO dao = factory.getInstrutorDAO();
            dao.update(instrutor);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public List getAll() throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IInstrutorDAO dao = factory.getInstrutorDAO();
            return dao.selectAll();
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public InstrutorVO getInstrutorByLogin(String login) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IInstrutorDAO dao = factory.getInstrutorDAO();
            return (InstrutorVO) dao.SelectByLogin(login);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }
}