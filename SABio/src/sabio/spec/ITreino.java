package sabio.spec;

import java.util.List;

import vo.TreinoVO;
import sabio.SABioException;

public interface ITreino {

	void create(TreinoVO vo) throws SABioException;

	void delete(int id) throws SABioException;

	void update(TreinoVO vo) throws SABioException;

	TreinoVO getTreino(int id) throws SABioException;

	TreinoVO getTreinoByUsuario(int id) throws SABioException;

	List getAll() throws SABioException;

}
