package dao.impl.jdbc;

import dao.DAOException;
import dao.spec.ITreinoDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import vo.ObjectVO;
import vo.TreinoVO;


public class TreinoJDBCDAO extends GenericJDBCDAO implements ITreinoDAO {

	public TreinoJDBCDAO(Properties properties) throws DAOException {
		super(properties);
	}

    @Override
	public void insert(ObjectVO vo) throws DAOException {
		String sql = "INSERT INTO " + this.getTableName()
				+ " (LOGIN, TREINO_ID, TIPO_TREINO, DATA_INICIO, NIVEL, NUMERO_DIAS, NOME_TREINO) VALUES (?,?,?,?,?,?,?)";
		try {
                        TreinoVO treino = (TreinoVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			
			stmt.setString(1, treino.getCliente());
			stmt.setInt(2, treino.getTreinoId());
			stmt.setString(3, treino.getTipoTreino());
                        Date dt = new Date(treino.getDataInicio().getTime().getTime());
			stmt.setDate(4, dt);
                        stmt.setInt(5, treino.getNivel());
                        stmt.setInt(6, treino.getNumeroDias());
                        stmt.setString(7, treino.getNomeTreino());
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}

    @Override
	public void update(ObjectVO vo) throws DAOException {
		String sql = "UPDATE " + this.getTableName()
				+ " TREINO_ID=?, TIPO_TREINO=?, DATA_INICIO=?, NIVEL=?, NUMERO_DIAS=?, NOME_TREINO=? WHERE LOGIN =?";
		try {
                        TreinoVO treino = (TreinoVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			
			stmt.setInt(1, treino.getTreinoId());
			stmt.setString(2, treino.getTipoTreino());
                        Date dt = new Date(treino.getDataInicio().getTime().getTime());
			stmt.setDate(3, dt);
                        stmt.setInt(4, treino.getNivel());
                        stmt.setInt(5, treino.getNumeroDias());
                        stmt.setString(6, treino.getNomeTreino());
                        stmt.setString(7, treino.getCliente());
                        
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}

    @Override
	public void delete(ObjectVO vo) throws DAOException {
		String sql = "DELETE " + this.getTableName()
				+ " WHERE LOGIN =?";
		try {
                        TreinoVO treino = (TreinoVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			
			stmt.setInt(1, treino.getTreinoId());
                        
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}
        
    @Override
	public TreinoVO selectByLogin(String Login) throws DAOException {
                ObjectVO vo = null;
		String sql = "SELECT * FROM " + this.getTableName()
				+ " WHERE LOGIN =?";
		try {
                        TreinoVO treino = (TreinoVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			
			stmt.setString(1, treino.getCliente());
                        
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				return (TreinoVO) createVO(rs);
			}
		} catch (SQLException | DAOException e) {
			throw new DAOException(e);
		}
		return null;
	}



    @Override
	public String getTableName() {
		return "TREINO";
	}

    @Override
	protected ObjectVO createVO(ResultSet rs) throws DAOException {
		try {
			String login = rs.getString("LOGIN");
			int treino_id = rs.getInt("TREINO_ID");
			String tipo_treino = rs.getString("SALDO");
                        Date dt = rs.getDate("DATA_INICIO");
                        int nivel = rs.getInt("NIVEL");
			int numero_dias = rs.getInt("NUMERO_DIAS");
                        String nome_treino = rs.getString("NOME_TREINO");
                        
                        Calendar cal = new GregorianCalendar();
			cal.setTime(dt);
                        
			return new TreinoVO(login, treino_id, tipo_treino, cal, nivel, numero_dias, nome_treino);
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}
}
