package sabio.spec;

import java.util.List;
import sabio.SABioException;
import vo.InstrutorVO;

public interface IInstrutor {

	void create(InstrutorVO instrutor) throws SABioException;

	void delete(String login) throws SABioException;

	void update(InstrutorVO instrutor) throws SABioException;

	InstrutorVO getInstrutorByLogin(String Login) throws SABioException;

	List getAll() throws SABioException;
}
