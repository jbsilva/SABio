package dao.impl.jdbc;

import dao.DAOException;
import dao.spec.IUsuarioDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import vo.ObjectVO;
import vo.UsuarioVO;

public class UsuarioJDBCDAO extends GenericJDBCDAO implements IUsuarioDAO {

    public UsuarioJDBCDAO(Properties properties) throws DAOException {
        super(properties);
    }

    @Override
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
    
    @Override
    public void update(ObjectVO vo) throws DAOException {
        UsuarioVO user = (UsuarioVO) vo;
        String sql = "UPDATE " + this.getTableName()
                + "SENHA = ? WHERE LOGIN = ?";
        try {
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);
            
            stmt.setString(1, user.getSenha());
            stmt.setString(2, user.getLogin());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }
    
    @Override
    public void delete(ObjectVO vo) throws DAOException {
        UsuarioVO user = (UsuarioVO) vo;
        String sql = "DELETE " + this.getTableName()
                + "WHERE LOGIN = ?";
		try {
                        UsuarioVO usuario = (UsuarioVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			
			stmt.setString(1, usuario.getLogin());
                        
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}
    
    @Override
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

    @Override
    public boolean checkLoginSenha(String login, String senha)
            throws DAOException {
        boolean autenticado = false;
        String sql = "SELECT SENHA FROM " + this.getTableName()
                + " WHERE LOGIN = '" + login + "'";
        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                String result = rs.getString("SENHA");
                autenticado = result.equals(senha);
            }
        } catch (SQLException e) {
            throw new DAOException(e);
        }
        return autenticado;
    }

    @Override
    public String getTableName() {
        return "USUARIO";
    }

    @Override
    protected ObjectVO createVO(ResultSet rs) throws DAOException {
        try {
            String login = rs.getString("LOGIN");
            String senha = rs.getString("SENHA");
            return new UsuarioVO(login, senha);
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }
}

