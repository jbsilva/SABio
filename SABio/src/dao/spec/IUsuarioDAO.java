package dao.spec;

import vo.UserVO;
import dao.DAOException;

public interface IUsuarioDAO extends IGenericDAO {

	boolean checkLoginSenha(String login, String senha)
			throws DAOException;

	UserVO selectByLogin(String login) throws DAOException;
}
