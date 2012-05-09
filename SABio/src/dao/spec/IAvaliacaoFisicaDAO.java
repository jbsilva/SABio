package dao.spec;

import java.util.List;

import vo.ObjectVO;
import dao.DAOException;
import vo.AvaliacaoFisicaVO;

public interface IAvaliacaoFisicaDAO {

	void insert(ObjectVO vo) throws DAOException;

	void update(ObjectVO vo) throws DAOException;

	void delete(ObjectVO vo) throws DAOException;

	AvaliacaoFisicaVO SelectByID(String ID) throws DAOException;

}