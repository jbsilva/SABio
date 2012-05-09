package dao.spec;

import java.util.List;

import vo.ObjectVO;
import dao.DAOException;

public interface IGenericDAO {

	List selectAll() throws DAOException;

	void insert(ObjectVO vo) throws DAOException;

	int selectLastID() throws DAOException;

	ObjectVO selectByUsuario(int Usuario) throws DAOException;

	void delete(int id) throws DAOException;

	void update(ObjectVO vo) throws DAOException;

}
