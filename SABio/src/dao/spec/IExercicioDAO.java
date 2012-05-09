package dao.spec;

import dao.DAOException;
import vo.ExercicioVO;

public interface IExercicioDAO extends IGenericDAO {

	ExercicioVO selectByExercicio(String exer) throws DAOException;
}