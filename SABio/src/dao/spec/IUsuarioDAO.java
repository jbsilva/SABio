package dao.spec;

import dao.DAOException;
import vo.UsuarioVO;

public interface IUsuarioDAO extends IGenericDAO {

    boolean checkLoginSenha(String login, String senha)
            throws DAOException;

    UsuarioVO selectByLogin(String login) throws DAOException;
}