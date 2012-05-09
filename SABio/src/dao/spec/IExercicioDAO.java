package dao.spec;

import dao.DAOException;
import vo.ExercicioVO;

public interface IExercicioDAO extends IGenericDAO {

	ExercicioVO selectByNome(String nome_ex) throws DAOException;
}