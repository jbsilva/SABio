package sabio.spec;

import java.util.List;
import sabio.SABioException;
import vo.ClienteVO;

public interface ICliente {
    

	void create(ClienteVO vo) throws SABioException;

	void delete(String login) throws SABioException;

	void update(ClienteVO vo) throws SABioException;

	ClienteVO getClienteByLogin(String Login) throws SABioException;

	List getAll() throws SABioException;
}