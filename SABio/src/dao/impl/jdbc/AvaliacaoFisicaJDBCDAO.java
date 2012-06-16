package dao.impl.jdbc;

import dao.DAOException;
import dao.DAOFactory;
import dao.spec.IAvaliacaoFisicaDAO;
import dao.spec.IClienteDAO;
import dao.spec.IInstrutorDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import vo.AvaliacaoFisicaVO;
import vo.ClienteVO;
import vo.InstrutorVO;
import vo.ObjectVO;

public class AvaliacaoFisicaJDBCDAO extends GenericJDBCDAO implements IAvaliacaoFisicaDAO {

    public AvaliacaoFisicaJDBCDAO(Properties properties) throws DAOException {
        super(properties);
    }

    @Override
    public void insert(ObjectVO vo) throws DAOException {
        String sql = "INSERT INTO " + this.getTableName()
                + " (LOGIN_CLIENTE, LOGIN_INSTRUTOR, ID, DATA_REALIZACAO, OBSERVACOES) VALUES (?,?,?,?,?)";
        try {
            AvaliacaoFisicaVO avaliacaofisica = (AvaliacaoFisicaVO) vo;
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setString(1, avaliacaofisica.getCliente().getUsuario().getLogin());
            stmt.setString(2, avaliacaofisica.getInstrutor().getUsuario().getLogin());
            stmt.setInt(3, avaliacaofisica.getID());
            Date dt = new Date(avaliacaofisica.getDataRealizacao().getTime().getTime());
            stmt.setDate(4, dt);
            stmt.setString(5, avaliacaofisica.getObservacoes());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public void update(ObjectVO vo) throws DAOException {
        String sql = "UPDATE " + this.getTableName()
                + " SET LOGIN_CLIENTE=?, LOGIN_INSTRUTOR=?, DATA_REALIZACAO=?, OBSERVACOES=? WHERE ID=? ";
        try {
            AvaliacaoFisicaVO avaliacaofisica = (AvaliacaoFisicaVO) vo;
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setString(1, avaliacaofisica.getCliente().getUsuario().getLogin());
            stmt.setString(2, avaliacaofisica.getInstrutor().getUsuario().getLogin());
            Date dt = new Date(avaliacaofisica.getDataRealizacao().getTime().getTime());
            stmt.setDate(3, dt);
            stmt.setString(4, avaliacaofisica.getObservacoes());
            stmt.setInt(5, avaliacaofisica.getID());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public void delete(ObjectVO vo) throws DAOException {
        String sql = "DELETE " + this.getTableName()
                + " WHERE ID=? ";
        try {
            AvaliacaoFisicaVO avaliacaofisica = (AvaliacaoFisicaVO) vo;
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);


            stmt.setInt(1, avaliacaofisica.getID());

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public AvaliacaoFisicaVO SelectById(int avaliacao_id) throws DAOException {
        ObjectVO vo = null;
        String sql = "SELECT * FROM " + this.getTableName()
                + " WHERE ID=? ";
        try {
            AvaliacaoFisicaVO avaliacaofisica = (AvaliacaoFisicaVO) vo;
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setInt(1, avaliacaofisica.getID());

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return (AvaliacaoFisicaVO) createVO(rs);
            }
        } catch (SQLException | DAOException e) {
            throw new DAOException(e);
        }
        return null;
    }

    @Override
    public String getTableName() {
        return "AVALIACAO_FISICA";
    }

    @Override
    protected ObjectVO createVO(ResultSet rs) throws DAOException {
        try {
            String login_cliente = rs.getString("LOGIN_CLIENTE");
            String login_instrutor = rs.getString("LOGIN_INSTRUTOR");
            int id = rs.getInt("ID");
            String observacoes = rs.getString("OBSERVACOES");
            Date dt = rs.getDate("DATA_REALIZACAO");

            Calendar cal = new GregorianCalendar();
            cal.setTime(dt);
            
            IClienteDAO clienteDAO = DAOFactory.getInstance().getClienteDAO();
            ClienteVO cliente = (ClienteVO) clienteDAO.SelectByLogin(login_cliente);
            
            IInstrutorDAO instrutorDAO = DAOFactory.getInstance().getInstrutorDAO();
            InstrutorVO instrutor = (InstrutorVO) instrutorDAO.SelectByLogin(login_cliente);
                    
            
            return new AvaliacaoFisicaVO(cliente, instrutor, id,
                    cal, observacoes);
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }
}
