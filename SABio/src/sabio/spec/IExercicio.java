package sabio.spec;

import java.util.List;
import sabio.SABioException;
import vo.ExercicioVO;

public interface IExercicio {

	void create(ExercicioVO vo) throws SABioException;

	void delete(String nome_ex) throws SABioException;

	void update(ExercicioVO vo) throws SABioException;

	ExercicioVO getExercicioByNome(String nome_ex) throws SABioException;

	List getAll() throws SABioException;
}