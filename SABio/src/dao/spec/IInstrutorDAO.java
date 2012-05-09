package dao.spec;

import java.util.List;

import vo.ObjectVO;
import dao.DAOException;
import vo.InstrutorVO;

public interface IInstrutorDAO {

	void insert(ObjectVO vo) throws DAOException;

	void update(ObjectVO vo) throws DAOException;

	void delete(ObjectVO vo) throws DAOException;

	InstrutorVO SelectByLogin(String Login) throws DAOException;

}