package sabio.spec;

import java.util.List;

import vo.UserVO;
import sabio.SABioException;

public interface IUsuario {

	void delete(int id) throws SABioException;

	void create(UserVO user) throws SABioException;

	void update(UserVO user) throws SABioException;

	UserVO getUsuario(int id) throws SABioException;

	List getAll() throws SABioException;

	UserVO getUsuarioByLogin(String login) throws SABioException;

	boolean authenticate(UserVO user) throws SABioException;

}
