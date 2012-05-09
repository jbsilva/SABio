package dao.impl.jdbc;

import dao.DAOException;
import dao.spec.IInstrutorDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import vo.InstrutorVO;
import vo.ObjectVO;


public class InstrutorJDBCDAO extends GenericJDBCDAO implements IInstrutorDAO {

	public InstrutorJDBCDAO(Properties properties) throws DAOException {
		super(properties);
	}

    @Override
	public void insert(ObjectVO vo) throws DAOException {
		String sql = "INSERT INTO " + this.getTableName()
				+ " (LOGIN, NOME, CPF, RG, ENDERECO, CARGA_HORARIA, NUMERO_CARTEIRA_TRABALHO, REGISTRO_PROFISSIONAL, DATA_CONTRATACAO) VALUES (?,?,?,?,?,?,?,?,?)";
		try {
                        InstrutorVO instrutor = (InstrutorVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			
			stmt.setString(1, instrutor.getUsuario());
			stmt.setString(2, instrutor.getNome());
			stmt.setString(3, instrutor.getCPF());
                        stmt.setString(4, instrutor.getRG());
                        stmt.setString(5, instrutor.getEndereco());
                        stmt.setInt(6, instrutor.getCargaHoraria());
                        stmt.setString(7, instrutor.getNumeroCarteiraTrabalho());
                        stmt.setString(8, instrutor.getRegistroProfissional());
                        Date dt = new Date(instrutor.getDataContratacao().getTime().getTime());
			stmt.setDate(9, dt);
                        
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}

    @Override
	public void update(ObjectVO vo) throws DAOException {
		String sql = "UPDATE " + this.getTableName()
				+ " SET NOME=?, CPF=?, RG=?, ENDERECO=?, CARGA_HORARIA=?, NUMERO_CARTEIRA_TRABALHO=?, REGISTRO_PROFISSIONAL=?, DATA_CONTRATACAO=? WHERE LOGIN=? ";
		try {
                        InstrutorVO instrutor = (InstrutorVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			
			stmt.setString(1, instrutor.getNome());
			stmt.setString(2, instrutor.getCPF());
                        stmt.setString(3, instrutor.getRG());
                        stmt.setString(4, instrutor.getEndereco());
                        stmt.setInt(5, instrutor.getCargaHoraria());
                        stmt.setString(6, instrutor.getNumeroCarteiraTrabalho());
                        stmt.setString(7, instrutor.getRegistroProfissional());
                        Date dt = new Date(instrutor.getDataContratacao().getTime().getTime());
			stmt.setDate(8, dt);
                        stmt.setString(9, instrutor.getUsuario());
                        
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
                        InstrutorVO instrutor = (InstrutorVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			
			stmt.setString(1, instrutor.getUsuario());
                        
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}
    
    @Override
	public InstrutorVO SelectByLogin(String Login) throws DAOException {
                ObjectVO vo = null;
		String sql = "SELECT * FROM " + this.getTableName()
				+ " WHERE LOGIN=? ";
		try {
                        InstrutorVO instrutor = (InstrutorVO) vo;
			PreparedStatement stmt = this.getConnection().prepareStatement(sql);
			
			stmt.setString(1, instrutor.getUsuario());

			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				return (InstrutorVO) createVO(rs);
			}
		} catch (SQLException | DAOException e) {
			throw new DAOException(e);
		}
		return null;
	}


    @Override
	public String getTableName() {
		return "INSTRUTOR";
	}

    @Override
	protected ObjectVO createVO(ResultSet rs) throws DAOException {
		try {
			String login = rs.getString("LOGIN");
			String nome = rs.getString("NOME");
			String cpf = rs.getString("CPF");
                        String rg = rs.getString("RG");
			String endereco = rs.getString("ENDERECO");
                        int carga_horaria = rs.getInt("CARGA_HORARIA");
                        String numero_carteira_trabalho = rs.getString("NUMERO_CARTEIRA_TRABALHO");
                        String registro_profissional = rs.getString("REGISTRO_PROFISSIONAL");
                        Date dt = rs.getDate("DATA_CONTRATACAO");
                        
                        Calendar cal = new GregorianCalendar();
			cal.setTime(dt);
                        
			return new InstrutorVO(login, nome, cpf, cal, rg, endereco, registro_profissional, numero_carteira_trabalho, carga_horaria);
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}
}
