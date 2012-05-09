package dao;

import dao.impl.jdbc.JDBCDAOFactory;
import dao.spec.*;
import util.Configuration;

abstract public class DAOFactory {

	private static DAOFactory instance = null;

	public static DAOFactory getInstance() {
		if (instance == null) {
			Configuration configuration = Configuration.getInstance();
			String value = configuration.getProperty("dao");
			if (value.equals("JDBC")) {
				instance = new JDBCDAOFactory(configuration.getProperties());
			}
                        System.out.println(instance);
		}
		return instance;
	}

	public abstract IUsuarioDAO getUsuarioDAO() throws DAOException;

	public abstract IAtendenteDAO getAtendenteDAO() throws DAOException;

	public abstract IClienteDAO getClienteDAO() throws DAOException;

	public abstract IExercicioDAO getExercicioDAO() throws DAOException;
        
        public abstract IInstrutorDAO getInstrutorDAO() throws DAOException;
        
        public abstract ITreinoDAO getTreinoDAO() throws DAOException;
        
        public abstract IAvaliacaoFisicaDAO getAvaliacaoFisicaDAO() throws DAOException;
}