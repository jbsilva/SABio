package dao.impl.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import vo.TreinoVO;
import vo.ObjectVO;
import vo.UsuarioVO;
import dao.DAOException;
import dao.DAOFactory;
import dao.spec.ITreinoDAO;
import dao.spec.IUsuarioDAO;

class TreinoJDBCDAO extends GenericJDBCDAO implements ITreinoDAO {

	public TreinoJDBCDAO(Properties properties) throws DAOException {
		super(properties);
	}

	public void update(ObjectVO vo) throws DAOException {
		String sql = "UPDATE " + this.getTableName()
				+ " SET NUMERO = ?, SALDO = ?, USUARIO_ID = ? WHERE ID = ?";
		try {
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			TreinoVO account = (TreinoVO) vo;
			stmt.setString(1, account.getNumero());
			stmt.setDouble(2, account.getSaldo());
			stmt.setInt(3, account.getUsuario().getId());
			stmt.setInt(4, account.getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}

	public void insert(ObjectVO vo) throws DAOException {
		String sql = "INSERT INTO " + this.getTableName()
				+ " (LOGIN, SENHA) VALUES (?,?)";
		try {
			TreinoVO account = (TreinoVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			stmt.setString(1, account.getNumero());
			stmt.setDouble(2, account.getSaldo());
			stmt.setInt(3, account.getUsuario().getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}

	public TreinoVO selectByUsuario(int id) throws DAOException {
		TreinoVO vo = null;
		String sql = "SELECT * FROM " + this.getTableName()
				+ " WHERE USUARIO_ID = " + id;
		try {
			Statement stmt = this.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				vo = (TreinoVO) this.createVO(rs);
			}
		} catch (SQLException e) {
			throw new DAOException(e);
		}
		return vo;
	}

	public String getTableName() {
		return "treino";
	}

	protected ObjectVO createVO(ResultSet rs) throws DAOException {
		try {
			int id = rs.getInt("ID");
			String number = rs.getString("NUMERO");
			float balance = rs.getFloat("SALDO");
			int userID = rs.getInt("USUARIO_ID");
			IUsuarioDAO userDAO = DAOFactory.getInstance().getUserDAO();
			UsuarioVO user = (UsuarioVO) userDAO.selectByID(userID);
			return new TreinoVO(id, number, new Double(balance), user);
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}
}
