package dao.impl.jdbc;

import dao.DAOException;
import dao.DAOFactory;
import dao.spec.IAtendenteDAO;
import dao.spec.IUsuarioDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import vo.AtendenteVO;
import vo.ObjectVO;
import vo.UsuarioVO;

public class AtendenteJDBCDAO extends GenericJDBCDAO implements IAtendenteDAO {

    public AtendenteJDBCDAO(Properties properties) throws DAOException {
        super(properties);
    }

    @Override
    public void insert(ObjectVO vo) throws DAOException {
        String sql = "INSERT INTO " + this.getTableName()
                + " (LOGIN, NOME, CPF, RG, ENDERECO, NUMERO_CARTEIRA_TRABALHO, DATA_CONTRATACAO) VALUES (?,?,?,?,?,?,?)";
        try {
            AtendenteVO atendente = (AtendenteVO) vo;
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setString(1, atendente.getUsuario().getLogin());
            stmt.setString(2, atendente.getNome());
            stmt.setString(3, atendente.getCPF());
            stmt.setString(4, atendente.getRG());
            stmt.setString(5, atendente.getEndereco());
            stmt.setString(6, atendente.getNumeroCarteiraTrabalho());
            Date dt = new Date(atendente.getDataContratacao().getTime().getTime());
            stmt.setDate(7, dt);

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public void update(ObjectVO vo) throws DAOException {
        String sql = "UPDATE " + this.getTableName()
                + " SET NOME=?, CPF=?, RG=?, ENDERECO=?, NUMERO_CARTEIRA_TRABALHO=?, DATA_CONTRATACAO=? WHERE LOGIN=? ";
        try {
            AtendenteVO atendente = (AtendenteVO) vo;
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setString(1, atendente.getNome());
            stmt.setString(2, atendente.getCPF());
            stmt.setString(3, atendente.getRG());
            stmt.setString(4, atendente.getEndereco());
            stmt.setString(5, atendente.getNumeroCarteiraTrabalho());
            Date dt = new Date(atendente.getDataContratacao().getTime().getTime());
            stmt.setDate(6, dt);
            stmt.setString(7, atendente.getUsuario().getLogin());

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public void delete(ObjectVO vo) throws DAOException {
        String sql = "DELETE " + this.getTableName()
                + " WHERE LOGIN=? ";
        try {
            AtendenteVO atendente = (AtendenteVO) vo;
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setString(1, atendente.getUsuario().getLogin());

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public AtendenteVO SelectByLogin(String Login) throws DAOException {
        ObjectVO vo = null;
        String sql = "SELECT * FROM " + this.getTableName()
                + " WHERE LOGIN=? ";
        try {
            AtendenteVO atendente = (AtendenteVO) vo;
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setString(1, atendente.getUsuario().getLogin());

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return (AtendenteVO) createVO(rs);
            }
        } catch (SQLException | DAOException e) {
            throw new DAOException(e);
        }
        return null;
    }

    @Override
    public String getTableName() {
        return "ATENDENTE";
    }

    @Override
    protected ObjectVO createVO(ResultSet rs) throws DAOException {
        try {
            String login = rs.getString("LOGIN");
            String nome = rs.getString("NOME");
            String cpf = rs.getString("CPF");
            String rg = rs.getString("RG");
            String endereco = rs.getString("ENDERECO");
            String numero_carteira_trabalho = rs.getString("NUMERO_CARTEIRA_TRABALHO");
            Date dt = rs.getDate("DATA_CONTRATACAO");

            Calendar cal = new GregorianCalendar();
            cal.setTime(dt);

            IUsuarioDAO userDAO = DAOFactory.getInstance().getUsuarioDAO();
            UsuarioVO user = (UsuarioVO) userDAO.selectByLogin(login);

            return new AtendenteVO(user, nome, cpf, rg, endereco, numero_carteira_trabalho, cal);
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }
}