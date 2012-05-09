package sabio.spec;

import java.util.List;

import vo.ClienteVO;
import sabio.SABioException;

public interface ICliente {

	void create(ClienteVO vo) throws SABioException;

	void delete(int id) throws SABioException;

	void update(ClienteVO vo) throws SABioException;

	ClienteVO getCliente(int id) throws SABioException;

	ClienteVO getClienteByLogin(String Login) throws SABioException;

	List getAll() throws SABioException;

}
