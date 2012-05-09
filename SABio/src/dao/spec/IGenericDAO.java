package dao.spec;

import java.util.List;

import vo.ObjectVO;
import dao.DAOException;

public interface IGenericDAO {

	void insert(ObjectVO vo) throws DAOException;

	void delete(int id) throws DAOException;

	void update(ObjectVO vo) throws DAOException;

}
