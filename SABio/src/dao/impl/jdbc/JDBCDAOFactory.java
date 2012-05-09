package dao.impl.jdbc;

import dao.DAOException;
import dao.DAOFactory;
import dao.spec.*;
import java.util.Properties;

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
            return new ClienteJDBCDAO(this.properties);
        }

    @Override
	public IExercicioDAO getExercicioDAO() throws DAOException{
            return new ExercicioJDBCDAO(this.properties);
        }

    @Override
        public IInstrutorDAO getInstrutorDAO() throws DAOException{
            return new InstrutorJDBCDAO(this.properties);
        }     
    
    @Override
        public IAvaliacaoFisicaDAO getAvaliacaoFisicaDAO() throws DAOException{
            return new AvaliacaoFisicaJDBCDAO(this.properties);
        }
}
