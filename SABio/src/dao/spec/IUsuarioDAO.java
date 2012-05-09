package dao.spec;

import dao.DAOException;
import vo.ObjectVO;
import vo.UsuarioVO;

public interface IUsuarioDAO extends IGenericDAO {
    
    @Override
    	void insert(ObjectVO vo) throws DAOException;

    @Override
	void update(ObjectVO vo) throws DAOException;

	void delete(ObjectVO vo) throws DAOException;

	boolean checkLoginSenha(String login, String senha)
			throws DAOException;

	UsuarioVO selectByLogin(String login) throws DAOException;
}
