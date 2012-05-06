package sabio.spec;

import java.util.List;

import vo.ContaVO;
import sabio.SABioException;

public interface IConta {

	void create(ContaVO vo) throws SABioException;

	void delete(int id) throws SABioException;

	void update(ContaVO vo) throws SABioException;

	ContaVO getConta(int id) throws SABioException;

	ContaVO getContaByUsuario(int id) throws SABioException;

	List getAll() throws SABioException;

}
