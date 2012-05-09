package dao.impl.jdbc;

import dao.DAOException;
import dao.spec.IExercicioDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import vo.ExercicioVO;
import vo.ObjectVO;


public class ExercicioJDBCDAO extends GenericJDBCDAO implements IExercicioDAO {

	public ExercicioJDBCDAO(Properties properties) throws DAOException {
		super(properties);
	}

    @Override
	public void insert(ObjectVO vo) throws DAOException {
		String sql = "INSERT INTO " + this.getTableName()
				+ " (TREINO_ID, CARGA, NUM_DE_SERIES, EXERCICIO, CLIENTE) VALUES (?,?,?,?,?,)";
		try {
                        ExercicioVO exercicio = (ExercicioVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			
			stmt.setInt(1, exercicio.getTreino());
			stmt.setInt(2, exercicio.getCarga());
			stmt.setInt(3, exercicio.getNumeroDeSeries());
                        stmt.setString(4, exercicio.getExercicio());
                        stmt.setString(5, exercicio.getCliente());
                        
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}

    @Override
	public void update(ObjectVO vo) throws DAOException {
		String sql = "UPDATE " + this.getTableName()
				+ " CLIENTE =?, CARGA=?, NUMERO_DE_SERIES=?, TREINO_ID=? WHERE EXERCICIO=?  ";
		try {
                        ExercicioVO exercicio = (ExercicioVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			
			stmt.setString(1, exercicio.getCliente());
			stmt.setInt(2, exercicio.getCarga());
			stmt.setInt(3, exercicio.getNumeroDeSeries());
                        stmt.setInt(4, exercicio.getTreino());
                        stmt.setString(5, exercicio.getExercicio());
                        
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}

	public void delete(ObjectVO vo) throws DAOException {
		String sql = "DELETE " + this.getTableName()
				+ " WHERE EXERCICIO =?";
		try {
                        ExercicioVO exercicio = (ExercicioVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			
			stmt.setString(1, exercicio.getExercicio());
                        
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}
        
	public ExercicioVO selectByExercicio(String exer) throws DAOException {
                ObjectVO vo = null;
		String sql = "SELECT * FROM " + this.getTableName()
				+ " WHERE EXERCICIO =?";
		try {
                        ExercicioVO exercicio = (ExercicioVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			
			stmt.setString(1, exercicio.getExercicio());
                        
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				return (ExercicioVO) createVO(rs);
			}
		} catch (SQLException | DAOException e) {
			throw new DAOException(e);
		}
		return null;
	}



    @Override
	public String getTableName() {
		return "Exercicio";
	}

    @Override
	protected ObjectVO createVO(ResultSet rs) throws DAOException {
		try {
			String login_cliente = rs.getString("CLIENTE");
			int carga = rs.getInt("CARGA");
			int num_series = rs.getInt("NUM_DE_SERIES");
                        String exercicio = rs.getString("EXERCICIO");
                        int treino_id = rs.getInt("TREINO_ID");

			return new ExercicioVO(treino_id, carga, exercicio, num_series, login_cliente);
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}
}
