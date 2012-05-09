package sabio.spec;

import java.util.List;
import sabio.SABioException;
import vo.TreinoVO;

public interface ITreino {

	void create(TreinoVO vo) throws SABioException;

	void delete(int id) throws SABioException;

	void update(TreinoVO vo) throws SABioException;

	TreinoVO getTreino(int id) throws SABioException;

	TreinoVO getTreinoByLogin(String Login) throws SABioException;

	List getAll() throws SABioException;

}
