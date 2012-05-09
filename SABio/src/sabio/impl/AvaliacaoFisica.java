package sabio.impl;

import java.util.List;

import dao.DAOFactory;
import dao.spec.IAvaliacaoFisicaDAO;
import sabio.SABioException;
import sabio.spec.IAvaliacaoFisica;
import vo.AvaliacaoFisicaVO;

public class AvaliacaoFisica implements IAvaliacaoFisica {

    public void delete(int avaliacao_id) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try
        {
            IAvaliacaoFisicaDAO dao = factory.getAvaliacaoFisicaDAO();
            AvaliacaoFisicaVO user = getAvaliacaoFisica(id);
            dao.delete(user);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public void create(AvaliacaoFisicaVO vo) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IAvaliacaoFisicaDAO dao = factory.getAvaliacaoFisicaDAO();
            dao.insert(vo);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public void update(AvaliacaoFisicaVO vo) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IAvaliacaoFisicaDAO dao = factory.getAvaliacaoFisicaDAO();
            dao.update(vo);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public AvaliacaoFisicaVO getAvaliacaoFisicaById(int avaliacao_id) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IAvaliacaoFisicaDAO dao = factory.getAvaliacaoFisicaDAO();
            return (AvaliacaoFisicaVO) dao.SelectById(avaliacao_id);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public List getAll() throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IAvaliacaoFisicaDAO dao = factory.getAvaliacaoFisicaDAO();
            return dao.selectAll();
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public AvaliacaoFisicaVO getAvaliacaoFisicaByLogin(String login) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IAvaliacaoFisicaDAO dao = factory.getAvaliacaoFisicaDAO();
            return (AvaliacaoFisicaVO) dao.selectByLogin(login);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public boolean authenticate(AvaliacaoFisicaVO user) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IAvaliacaoFisicaDAO dao = factory.getAvaliacaoFisicaDAO();
            return dao.checkLoginSenha(user.getLogin(), user.getSenha());
        } catch (Exception e) {
            e.printStackTrace();
            throw new SABioException(e);
        }
    }
}