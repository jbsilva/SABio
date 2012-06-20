package dao.spec;

import java.util.List;

import dao.DAOException;
import vo.ClienteVO;

public interface IClienteDAO extends IGenericDAO {

	ClienteVO SelectByLogin(String Login) throws DAOException;
        List<ClienteVO> SelectAll() throws DAOException;
        void delete(ClienteVO vo) throws DAOException;
}