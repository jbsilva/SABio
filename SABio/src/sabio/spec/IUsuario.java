package sabio.spec;

import java.util.List;
import sabio.SABioException;
import vo.UsuarioVO;

public interface IUsuario {

	void delete(int id) throws SABioException;

	void create(UsuarioVO user) throws SABioException;

	void update(UsuarioVO user) throws SABioException;

	UsuarioVO getUsuario(int id) throws SABioException;

	List getAll() throws SABioException;

	UsuarioVO getUsuarioByLogin(String login) throws SABioException;

	boolean authenticate(UsuarioVO user) throws SABioException;

}
