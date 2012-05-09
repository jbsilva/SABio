package dao.impl.jdbc;

import dao.DAOException;
import dao.spec.IClienteDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import vo.ClienteVO;
import vo.ObjectVO;


public class ClienteJDBCDAO extends GenericJDBCDAO implements IClienteDAO {

	public ClienteJDBCDAO(Properties properties) throws DAOException {
		super(properties);
	}
     @Override
	public void insert(ObjectVO vo) throws DAOException {
		String sql = "INSERT INTO " + this.getTableName()
				+ " (LOGIN, NOME, CPF, RG, DATA_INGRESSO, TELEFONE, ATESTADO_MEDICO, DATA_NASCIMENTO, MENSALIDADES_ABERTAS, STATUS) VALUES (?,?,?,?,?,?,?,?,?,?)";
		try {
                        ClienteVO cliente = (ClienteVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			
			stmt.setString(1, cliente.getUsuario());
			stmt.setString(2, cliente.getNomeCliente());
			stmt.setString(3, cliente.getCPF());
                        stmt.setString(4, cliente.getRG());
                        Date dt = new Date(cliente.getDataIngresso().getTime().getTime());
			stmt.setDate(5, dt);
                        stmt.setString(6, cliente.getTelefone()); //NO BANCO ESTA COMO INT !!! 
                        stmt.setString(7, cliente.getAtestadoMedico());
                        Date dtn = new Date(cliente.getDataNascimento().getTime().getTime());
			stmt.setDate(8, dtn);
                        stmt.setString(9, cliente.getMensalidadesAbertas());
                        stmt.setBoolean(10, cliente. getStatus());
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}

    @Override
	public void update(ObjectVO vo) throws DAOException {
		String sql = "UPDATE " + this.getTableName()
				+ " NOME=?, CPF=?, RG=?, DATA_INGRESSO=?, TELEFONE=?, ATESTADO_MEDICO=?, DATA_NASCIMENTO=?, MENSALIDADES_ABERTAS=?, STATUS=? WHERE LOGIN=? ";
		try {
                        ClienteVO cliente = (ClienteVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			
			stmt.setString(1, cliente.getNomeCliente());
			stmt.setString(2, cliente.getCPF());
                        stmt.setString(3, cliente.getRG());
                        Date dt = new Date(cliente.getDataIngresso().getTime().getTime());
			stmt.setDate(4, dt);
                        stmt.setString(5, cliente.getTelefone()); //NO BANCO ESTA COMO INT !!! 
                        stmt.setString(6, cliente.getAtestadoMedico());
                        Date dtn = new Date(cliente.getDataNascimento().getTime().getTime());
			stmt.setDate(7, dtn);
                        stmt.setString(8, cliente.getMensalidadesAbertas());
                        stmt.setBoolean(9, cliente. getStatus());
 			stmt.setString(10, cliente.getUsuario());                       
                        
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}

	public void delete(ObjectVO vo) throws DAOException {
		String sql = "DELETE " + this.getTableName()
				+ " WHERE LOGIN=? ";
		try {
                        ClienteVO cliente = (ClienteVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			
			stmt.setString(1, cliente.getNomeCliente());                      
                        
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}
    
	public ClienteVO SelectByLogin(String Login) throws DAOException {
                ObjectVO vo = null;
		String sql = "SELECT * FROM  " + this.getTableName()
				+ " WHERE LOGIN=? ";
		try {
                        ClienteVO cliente = (ClienteVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			
			stmt.setString(1, cliente.getNomeCliente());

			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				return (ClienteVO) createVO(rs);
			}
		} catch (SQLException | DAOException e) {
			throw new DAOException(e);
		}
		return null;
	}

    @Override
	public String getTableName() {
		return "CLIENTE";
	}

    @Override
	protected ObjectVO createVO(ResultSet rs) throws DAOException {
		try {
			String login = rs.getString("LOGIN");
			String nome = rs.getString("NOME");
			String cpf = rs.getString("CPF");
                        String rg = rs.getString("RG");
                        Date dt = rs.getDate("DATA_INGRESSO");
			String telefone = rs.getString("TELEFONE");
                        String atestado_medico = rs.getString("ATESTADO_MEDICO");
                        Date dtn = rs.getDate("DATA_NASCIMENTO");
                        String mensalidades_abertas = rs.getString("MENSALIDADES_ABERTAS");
                        Boolean status = rs.getBoolean("STATUS");
                        
                        Calendar cal1 = new GregorianCalendar();
			cal1.setTime(dt);
                        
                        Calendar cal2 = new GregorianCalendar();
			cal2.setTime(dtn);
                        
			return new ClienteVO(login, nome, cpf, rg, telefone, atestado_medico, cal1, mensalidades_abertas, cal2, status);
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}
}
