package sabio.impl;

import java.util.List;

import dao.DAOFactory;
import dao.spec.IExercicioDAO;
import sabio.SABioException;
import sabio.spec.IExercicio;
import vo.ExercicioVO;

public class Exercicio implements IExercicio {

    public void delete(String nome_ex) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try
        {
            IExercicioDAO dao = factory.getExercicioDAO();
            ExercicioVO exercicio = getExercicioByNome(nome_ex);
            dao.delete(exercicio);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public void create(ExercicioVO vo) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IExercicioDAO dao = factory.getExercicioDAO();
            dao.insert(vo);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public void update(ExercicioVO vo) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IExercicioDAO dao = factory.getExercicioDAO();
            dao.update(vo);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public ExercicioVO getExercicioByNome(String nome_ex) throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IExercicioDAO dao = factory.getExercicioDAO();
            return (ExercicioVO) dao.selectByNome(nome_ex);
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }

    public List getAll() throws SABioException {
        DAOFactory factory = DAOFactory.getInstance();
        try {
            IExercicioDAO dao = factory.getExercicioDAO();
            return dao.selectAll();
        } catch (Exception e) {
            throw new SABioException(e);
        }
    }
}