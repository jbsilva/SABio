package dao.spec;

import java.util.List;

import vo.AtendenteVO;
import dao.DAOException;
import vo.ObjectVO;

public interface IAtendenteDAO extends IGenericDAO {

    @Override
	void insert(ObjectVO vo) throws DAOException;

	int selectLastID() throws DAOException;

	AtendenteVO SelectByLogin(String Login) throws DAOException;

	void delete(ObjectVO vo) throws DAOException;

    @Override
	void update(ObjectVO vo) throws DAOException;

}
