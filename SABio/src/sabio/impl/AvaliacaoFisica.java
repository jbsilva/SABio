package sabio.impl;

import dao.DAOException;
import dao.DAOFactory;
import dao.spec.IAvaliacaoFisicaDAO;
import java.util.List;
import sabio.SABioException;
import sabio.spec.IAvaliacaoFisica;
import vo.AvaliacaoFisicaVO;

public class AvaliacaoFisica implements IAvaliacaoFisica {

    @Override
    public void delete(int avaliacao_id) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try
        {
            IAvaliacaoFisicaDAO dao = factory.getAvaliacaoFisicaDAO();
            AvaliacaoFisicaVO user = getAvaliacaoFisicaById(avaliacao_id);
            dao.delete(user);
        } catch (DAOException | SABioException e) {
            throw new SABioException(e);
        }
    }

    @Override
    public void create(AvaliacaoFisicaVO vo) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IAvaliacaoFisicaDAO dao = factory.getAvaliacaoFisicaDAO();
            dao.insert(vo);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    @Override
    public void update(AvaliacaoFisicaVO vo) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IAvaliacaoFisicaDAO dao = factory.getAvaliacaoFisicaDAO();
            dao.update(vo);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    @Override
    public AvaliacaoFisicaVO getAvaliacaoFisicaById(int avaliacao_id) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IAvaliacaoFisicaDAO dao = factory.getAvaliacaoFisicaDAO();
            return (AvaliacaoFisicaVO) dao.SelectById(avaliacao_id);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    @Override
    public List<AvaliacaoFisicaVO> getAll() throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IAvaliacaoFisicaDAO dao = factory.getAvaliacaoFisicaDAO();
            return dao.SelectAll();
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }
}