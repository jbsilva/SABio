package dao.spec;

import vo.TreinoVO;
import dao.DAOException;

public interface ITreinoDAO extends IGenericDAO {

	TreinoVO selectByUsuario(int id) throws DAOException;

}
