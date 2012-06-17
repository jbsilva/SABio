package dao.spec;

import dao.DAOException;
import java.util.List;
import vo.AvaliacaoFisicaVO;

public interface IAvaliacaoFisicaDAO extends IGenericDAO {
    
    AvaliacaoFisicaVO SelectById(int avaliacao_id) throws DAOException;
    List<AvaliacaoFisicaVO> SelectAll() throws DAOException;
}