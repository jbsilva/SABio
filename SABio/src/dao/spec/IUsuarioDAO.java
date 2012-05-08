package dao.spec;

import vo.UsuarioVO;
import dao.DAOException;

public interface IUsuarioDAO extends IGenericDAO {

	boolean checkLoginSenha(String login, String senha)
			throws DAOException;

	UsuarioVO selectByLogin(String login) throws DAOException;
}
