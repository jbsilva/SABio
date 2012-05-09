package sabio.spec;

import java.util.List;
import sabio.SABioException;
import vo.ExercicioVO;

public interface IExercicio {

	void create(ExercicioVO vo) throws SABioException;

	void delete(int id) throws SABioException;

	void update(ExercicioVO vo) throws SABioException;

	ExercicioVO getExercicio(int id) throws SABioException;

	ExercicioVO getExercicioByID(String Login) throws SABioException;

	List getAll() throws SABioException;

}
