package dao.spec;

import dao.DAOException;
import java.util.List;
import vo.ObjectVO;

public interface IGenericDAO {
    
    	List<Object> selectAll() throws DAOException;
        
	int selectLastID() throws DAOException;
	ObjectVO selectByLogin(String login) throws DAOException;

        void insert(ObjectVO vo) throws DAOException;
	void delete(ObjectVO vo) throws DAOException;
	void update(ObjectVO vo) throws DAOException;
}
