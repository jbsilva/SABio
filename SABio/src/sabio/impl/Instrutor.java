package sabio.impl;

import dao.DAOException;
import dao.DAOFactory;
import dao.spec.IInstrutorDAO;
import java.util.List;
import sabio.SABioException;
import sabio.spec.IInstrutor;
import vo.InstrutorVO;

public class Instrutor implements IInstrutor {

    @Override
    public void delete(String login) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try
        {
            IInstrutorDAO dao = factory.getInstrutorDAO();
            InstrutorVO instrutor = getInstrutorByLogin(login);
            dao.delete(instrutor);
        } catch (DAOException | SABioException e) {
            throw new SABioException(e);
        }
    }

    @Override
    public void create(InstrutorVO instrutor) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IInstrutorDAO dao = factory.getInstrutorDAO();
            dao.insert(instrutor);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    @Override
    public void update(InstrutorVO instrutor) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IInstrutorDAO dao = factory.getInstrutorDAO();
            dao.update(instrutor);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    @Override
    public List getAll() throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IInstrutorDAO dao = factory.getInstrutorDAO();
            return dao.selectAll();
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    @Override
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