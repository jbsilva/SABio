package sabio.impl;

import dao.DAOFactory;
import dao.spec.ITreinoDAO;
import java.util.List;
import sabio.SABioException;
import sabio.spec.ITreino;
import vo.TreinoVO;

public class Treino implements ITreino {

    public void create(TreinoVO vo) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            ITreinoDAO dao = factory.getTreinoDAO();
            dao.insert(vo);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public void delete(int treino_id) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            ITreinoDAO dao = factory.getTreinoDAO();
            TreinoVO treino = getTreino(treino_id);
            dao.delete(treino);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public void update(TreinoVO vo) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            ITreinoDAO dao = factory.getTreinoDAO();
            dao.update(vo);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public TreinoVO getTreino(int treino_id) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            ITreinoDAO dao = factory.getTreinoDAO();
            return (TreinoVO) dao.selectByTreinoId(treino_id);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public TreinoVO getTreinoByLogin(String Login) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            ITreinoDAO dao = factory.getTreinoDAO();
            return dao.selectByLogin(Login);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public List getAll() throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            ITreinoDAO dao = factory.getTreinoDAO();
            return dao.selectAll();
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }
}
