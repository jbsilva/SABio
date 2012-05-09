package dao.spec;

import dao.DAOException;
import vo.AvaliacaoFisicaVO;

public interface IAvaliacaoFisicaDAO extends IGenericDAO {
    
    AvaliacaoFisicaVO SelectByID(int avaliacao_id) throws DAOException;
}