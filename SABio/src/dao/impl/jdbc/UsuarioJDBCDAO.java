package dao.impl.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import vo.ObjectVO;
import vo.UsuarioVO;
import dao.DAOException;
import dao.spec.IUsuarioDAO;

public class UsuarioJDBCDAO extends GenericJDBCDAO implements IUsuarioDAO {

    public UsuarioJDBCDAO(Properties properties) throws DAOException {
        super(properties);
    }

    public void update(ObjectVO vo) throws DAOException {
        UsuarioVO user = (UsuarioVO) vo;
        String sql = "UPDATE " + this.getTableName()
                + " SET LOGIN = ?, SENHA = ?";
        try {
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);
            stmt.setString(1, user.getLogin());
            stmt.setString(2, user.getSenha());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    public void insert(ObjectVO vo) throws DAOException {
        String sql = "INSERT INTO " + this.getTableName()
                + " (LOGIN, SENHA) VALUES (?,?)";
        try {
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);
            UsuarioVO user = (UsuarioVO) vo;
            stmt.setString(1, user.getLogin());
            stmt.setString(2, user.getSenha());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    public boolean checkLoginSenha(String login, String senha)
            throws DAOException {
        boolean isAuthenticated = false;
        String sql = "SELECT SENHA FROM " + this.getTableName()
                + " WHERE LOGIN = '" + login + "'";
        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                String result = rs.getString("SENHA");
                isAuthenticated = result.equals(senha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DAOException(e);
        }
        return isAuthenticated;
    }

    public String getTableName() {
        return "USUARIO";
    }

    protected ObjectVO createVO(ResultSet rs) throws DAOException {
        try {
            String login = rs.getString("LOGIN");
            String senha = rs.getString("SENHA");
            return new UsuarioVO(login, senha);
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    public final UsuarioVO selectByLogin(String login) throws DAOException {
        ObjectVO vo = null;
        String sql = "SELECT * FROM " + this.getTableName() + " WHERE LOGIN = '"
                + login + "'";
        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                vo = this.createVO(rs);
            }
        } catch (SQLException e) {
            throw new DAOException(e);
        }
        return (UsuarioVO) vo;
    }
}
