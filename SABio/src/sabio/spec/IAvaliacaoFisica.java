package sabio.spec;

import java.util.List;
import sabio.SABioException;
import vo.AvaliacaoFisicaVO;

public interface IAvaliacaoFisica {

	void create(AvaliacaoFisicaVO vo) throws SABioException;

	void delete(int avaliacao_id) throws SABioException;

	void update(AvaliacaoFisicaVO vo) throws SABioException;

	AvaliacaoFisicaVO getAvaliacaoFisicaById(int id) throws SABioException;

	List getAll() throws SABioException;

}
