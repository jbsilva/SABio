package dao.impl.jdbc;

import dao.DAOException;
import dao.DAOFactory;
import dao.spec.ITreinoDAO;
import dao.spec.IUsuarioDAO;
import java.util.Properties;

public class JDBCDAOFactory extends DAOFactory {

	private Properties properties;

	public JDBCDAOFactory(Properties properties) {
		this.properties = properties;
	}

    @Override
	public IUsuarioDAO getUserDAO() throws DAOException {
		return new UsuarioJDBCDAO(this.properties) {};
	}

    @Override
	public ITreinoDAO getAccountDAO() throws DAOException {
		return new TreinoJDBCDAO(this.properties);
	}
}
