package sabio.impl;

import java.util.List;

import vo.UserVO;
import sabio.SABioException;
import sabio.spec.IUsuario;
import dao.DAOFactory;
import dao.spec.IUsuarioDAO;

public class Usuario implements IUsuario {

	public void delete(int id) throws SABioException {
		DAOFactory factory = DAOFactory.getInstance();
		try {
			IUsuarioDAO dao = factory.getUserDAO();
			dao.delete(id);
		} catch (Exception e) {
			throw new SABioException(e);
		}
	}

	public void create(UserVO user) throws SABioException {
		DAOFactory factory = DAOFactory.getInstance();
		try {
			IUsuarioDAO dao = factory.getUserDAO();
			user.setId(dao.selectLastID() + 1);
			dao.insert(user);
		} catch (Exception e) {
			throw new SABioException(e);
		}
	}

	public void update(UserVO user) throws SABioException {
		DAOFactory factory = DAOFactory.getInstance();
		try {
			IUsuarioDAO dao = factory.getUserDAO();
			dao.update(user);
		} catch (Exception e) {
			throw new SABioException(e);
		}
	}

	public UserVO getUsuario(int id) throws SABioException {
		DAOFactory factory = DAOFactory.getInstance();
		try {
			IUsuarioDAO dao = factory.getUserDAO();
			return (UserVO) dao.selectByID(id);
		} catch (Exception e) {
			throw new SABioException(e);
		}
	}

	public List getAll() throws SABioException {
		DAOFactory factory = DAOFactory.getInstance();
		try {
			IUsuarioDAO dao = factory.getUserDAO();
			return dao.selectAll();
		} catch (Exception e) {
			throw new SABioException(e);
		}
	}

	public UserVO getUsuarioByLogin(String login) throws SABioException {
		DAOFactory factory = DAOFactory.getInstance();
		try {
			IUsuarioDAO dao = factory.getUserDAO();
			return (UserVO) dao.selectByLogin(login);
		} catch (Exception e) {
			throw new SABioException(e);
		}
	}

	public boolean authenticate(UserVO user) throws SABioException {
		DAOFactory factory = DAOFactory.getInstance();
		try {
			IUsuarioDAO dao = factory.getUserDAO();
			return dao.checkLoginSenha(user.getLogin(), user.getSenha());
		} catch (Exception e) {
                    e.printStackTrace();
			throw new SABioException(e);
		}
	}
}
