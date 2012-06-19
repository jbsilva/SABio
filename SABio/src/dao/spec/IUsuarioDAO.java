package dao.spec;

import dao.DAOException;
import vo.ObjectVO;
import vo.UsuarioVO;

public interface IUsuarioDAO extends IGenericDAO {

    boolean checkLoginSenha(String login, String senha) throws DAOException;

    UsuarioVO selectByLogin(String login) throws DAOException;

    @Override
    void update(ObjectVO vo) throws DAOException;
}