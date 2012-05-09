package dao.spec;

import java.util.List;

import vo.ObjectVO;
import dao.DAOException;
import vo.ExercicioVO;

public interface IExercicioDAO {

	void insert(ObjectVO vo) throws DAOException;

	void update(ObjectVO vo) throws DAOException;

	void delete(ObjectVO vo) throws DAOException;

	ExercicioVO selectByExercicio(String exer) throws DAOException;

}