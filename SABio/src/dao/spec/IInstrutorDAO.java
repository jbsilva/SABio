package dao.spec;

import dao.DAOException;
import vo.InstrutorVO;

public interface IInstrutorDAO extends IGenericDAO {

    InstrutorVO SelectByLogin(String Login) throws DAOException;
    
    void delete(InstrutorVO vo) throws DAOException;
    
    
}