package sabio.spec;

import java.util.List;

import vo.AtendenteVO;
import sabio.SABioException;

public interface IAtendente {

	void create(AtendenteVO vo) throws SABioException;

	void delete(int id) throws SABioException;

	void update(AtendenteVO vo) throws SABioException;

	AtendenteVO getAtendente(int id) throws SABioException;

	AtendenteVO getAtendenteByLogin(String Login) throws SABioException;

	List getAll() throws SABioException;

}
