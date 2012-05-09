package dao.spec;

import java.util.List;

import vo.AtendenteVO;
import dao.DAOException;
import vo.ObjectVO;

public interface IAtendenteDAO extends IGenericDAO {

    public AtendenteVO SelectByLogin(String Login) throws DAOException;
}