package sabio.spec;

import java.util.List;
import sabio.SABioException;
import vo.AvaliacaoFisicaVO;

public interface IAvaliacaoFisica {

	void create(AvaliacaoFisicaVO vo) throws SABioException;

	void delete(int id) throws SABioException;

	void update(AvaliacaoFisicaVO vo) throws SABioException;

	AvaliacaoFisicaVO getAvaliacaoFisica(int id) throws SABioException;

	AvaliacaoFisicaVO getAvaliacaoFisicaByLogin(String Login) throws SABioException;

	List getAll() throws SABioException;

}
