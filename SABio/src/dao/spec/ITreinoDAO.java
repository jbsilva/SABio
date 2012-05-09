package dao.spec;

import java.util.List;

import vo.ObjectVO;
import dao.DAOException;
import vo.TreinoVO;

public interface ITreinoDAO {

    void insert(ObjectVO vo) throws DAOException;

    void update(ObjectVO vo) throws DAOException;

    void delete(ObjectVO vo) throws DAOException;

    TreinoVO selectByLogin(String Login) throws DAOException;

    TreinoVO selectByTreinoId(int treino_id) throws DAOException;
    
    List<Object> selectAll() throws DAOException;
}