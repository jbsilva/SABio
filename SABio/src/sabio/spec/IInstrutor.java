package sabio.spec;

import java.util.List;
import sabio.SABioException;
import vo.InstrutorVO;

public interface IInstrutor {

	void create(InstrutorVO inst) throws SABioException;

	void delete(int id) throws SABioException;

	void update(InstrutorVO inst) throws SABioException;

	InstrutorVO getInstrutor(int id) throws SABioException;

	InstrutorVO getInstrutorByLogin(String Login) throws SABioException;

	List getAll() throws SABioException;

}
