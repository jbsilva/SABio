package dao.spec;

import dao.DAOException;
import java.util.List;
import vo.TreinoVO;

public interface ITreinoDAO extends IGenericDAO {

    TreinoVO selectByLogin(String Login) throws DAOException;
    TreinoVO selectByTreinoId(int treino_id) throws DAOException;
}