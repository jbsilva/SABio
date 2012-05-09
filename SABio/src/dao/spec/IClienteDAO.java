package dao.spec;

import java.util.List;

import vo.ObjectVO;
import dao.DAOException;
import vo.ClienteVO;

public interface IClienteDAO {

	void insert(ObjectVO vo) throws DAOException;

	void update(ObjectVO vo) throws DAOException;

	void delete(ObjectVO vo) throws DAOException;

	ClienteVO SelectByLogin(String Login) throws DAOException;

}