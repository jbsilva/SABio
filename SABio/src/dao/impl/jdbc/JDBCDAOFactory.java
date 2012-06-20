package dao.impl.jdbc;

import dao.DAOException;
import dao.DAOFactory;
import dao.spec.*;
import java.util.Properties;
import vo.ObjectVO;

public class JDBCDAOFactory extends DAOFactory {

	private Properties properties;

	public JDBCDAOFactory(Properties properties) {
		this.properties = properties;
	}

    @Override
	public IUsuarioDAO getUsuarioDAO() throws DAOException {
		return new UsuarioJDBCDAO(this.properties) {};
	}
    
    @Override
	public ITreinoDAO getTreinoDAO() throws DAOException {
		return new TreinoJDBCDAO(this.properties);
	}
        	
    @Override
	public IAtendenteDAO getAtendenteDAO() throws DAOException {
            return new AtendenteJDBCDAO(this.properties);
            
        }

    @Override
	public IClienteDAO getClienteDAO() throws DAOException{
            return new ClienteJDBCDAOImpl(this.properties) {};
        }

    @Override
	public IExercicioDAO getExercicioDAO() throws DAOException{
            return new ExercicioJDBCDAO(this.properties);
        }

    @Override
        public IInstrutorDAO getInstrutorDAO() throws DAOException{
            return new InstrutorJDBCDAO(this.properties) {

            @Override
            public void delete(ObjectVO vo) throws DAOException {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };

        }     
    
    @Override
        public IAvaliacaoFisicaDAO getAvaliacaoFisicaDAO() throws DAOException{
            return new AvaliacaoFisicaJDBCDAO(this.properties) {

            @Override
            public void delete(ObjectVO vo) throws DAOException {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        }

    private static abstract class ClienteJDBCDAOImpl extends ClienteJDBCDAO {

        public ClienteJDBCDAOImpl(Properties properties) throws DAOException {
            super(properties);
        }

        @Override
        public void delete(ObjectVO vo) throws DAOException {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
