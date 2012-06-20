package dao.impl.jdbc;

import dao.DAOException;
import dao.DAOFactory;
import dao.spec.IClienteDAO;
import dao.spec.IUsuarioDAO;
import java.sql.Date;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import vo.ClienteVO;
import vo.ObjectVO;
import vo.UsuarioVO;


public abstract class ClienteJDBCDAO extends GenericJDBCDAO implements IClienteDAO {

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
			
			stmt.setString(1, cliente.getUsuario().getLogin());
			stmt.setString(2, cliente.getNomeCliente());
			stmt.setString(3, cliente.getCPF());
                        stmt.setString(4, cliente.getRG());
                        Date dt = new Date(cliente.getDataIngresso().getTime().getTime());
			stmt.setDate(5, dt);
                        stmt.setString(6, cliente.getTelefone()); 
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
				+ " SET NOME=?, CPF=?, RG=?, DATA_INGRESSO=?, TELEFONE=?, ATESTADO_MEDICO=?, DATA_NASCIMENTO=?, MENSALIDADES_ABERTAS=?, STATUS=? WHERE LOGIN=? ";
		try {
                        ClienteVO cliente = (ClienteVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			
			stmt.setString(1, cliente.getNomeCliente());
			stmt.setString(2, cliente.getCPF());
                        stmt.setString(3, cliente.getRG());
                        Date dt = new Date(cliente.getDataIngresso().getTime().getTime());
			stmt.setDate(4, dt);
                        stmt.setString(5, cliente.getTelefone());
                        stmt.setString(6, cliente.getAtestadoMedico());
                        Date dtn = new Date(cliente.getDataNascimento().getTime().getTime());
			stmt.setDate(7, dtn);
                        stmt.setString(8, cliente.getMensalidadesAbertas());
                        stmt.setBoolean(9, cliente. getStatus());
 			stmt.setString(10, cliente.getUsuario().getLogin());                       
                        
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}

    @Override
	public void delete(ClienteVO vo) throws DAOException {
		String sql = "DELETE FROM " + this.getTableName() + " WHERE LOGIN = '"
                + vo.getUsuario().getLogin() + "'";
                
                Statement stmt;
                try {
                    stmt = this.getConnection().createStatement();
                    stmt.executeQuery(sql);
                }catch (SQLException ex) {
                    Logger.getLogger(ClienteJDBCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
		
	}
    
    @Override
	public ClienteVO SelectByLogin(String login) throws DAOException {
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
        return (ClienteVO) vo;
	}
    @Override
    public List<ClienteVO> SelectAll() throws DAOException {
        List<ClienteVO> clientes = new ArrayList<>();

        ObjectVO vo = null;
        ClienteVO devedor = (ClienteVO) vo;

        String sql = "SELECT * FROM " + this.getTableName();

        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs != null) {
                while (rs.next()) {
                    devedor = this.createVO(rs);
                    clientes.add(devedor);
                }
            }
        } catch (SQLException e) {
            throw new DAOException(e);
        }

        return clientes;
    }
    /*
    public String[][] SelectAll(String condicao) throws DAOException {
        
        String sql = 
            "SELECT * FROM " + this.getTableName() +
            (condicao.equals("") ? "" : " WHERE  MENSALIDADES_ABERTAS =!" + condicao); 
        

        
        List<String[]> possui = new ArrayList<String[]>();
        int numLinhas = 0;
        
        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs != null) {
                while(rs.next()) {
                   
                    List<String> devedores = new ArrayList<String>();
                    
                    devedores.add(rs.getString("LOGIN"));
                    devedores.add(rs.getString("CPF"));
                    devedores.add(rs.getString("RG"));
                    devedores.add(rs.getString("MENSALIDADES_ABERTAS"));
                    
                    
                    possui.add(devedores.toArray(new String[4]));
                    numLinhas++;
                }
            }
        } catch (SQLException e) {
            StackTraceElement[] stack = e.getStackTrace();
            if (stack.length > 0) {
                System.err.println("Message: " + e.getMessage());
                System.err.println("Command: " + sql);
                System.err.println("Exception: " + e);
            }
        }
        
        return possui.toArray(new String[numLinhas][5]);
    }*/
        
    @Override
	public String getTableName() {
		return "CLIENTE";
	}

    @Override
	protected ClienteVO createVO(ResultSet rs) throws DAOException {
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
                        
                        IUsuarioDAO userDAO = DAOFactory.getInstance().getUsuarioDAO();
			UsuarioVO user = (UsuarioVO) userDAO.selectByLogin(login);
                        
			return new ClienteVO(user, nome, cpf, rg, telefone, atestado_medico, cal1, mensalidades_abertas, cal2, status);
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}
}
