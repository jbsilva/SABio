package dao.spec;

import dao.DAOException;
import java.util.List;
import vo.ObjectVO;

public interface IGenericDAO {

    void insert(ObjectVO vo) throws DAOException;

    void delete(ObjectVO vo) throws DAOException;

    void update(ObjectVO vo) throws DAOException;

    List<Object> selectAll() throws DAOException;
}