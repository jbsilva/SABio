package tests.dao;

import dao.DAOException;
import dao.impl.jdbc.UsuarioJDBCDAO;
import dao.spec.IGenericDAO;
import dao.spec.IUsuarioDAO;
import junit.framework.Assert;
import org.junit.Test;
import util.Configuration;

public class UsuarioJDBCDAOTest{

    private IUsuarioDAO userDAO;
    protected IGenericDAO objDAO;

    protected void setupMainDAO() throws DAOException {
        objDAO = new UsuarioJDBCDAO(Configuration.getInstance().getProperties());
        userDAO = (IUsuarioDAO) objDAO;
    }

    @Test
    public void testCheckLogin() throws DAOException {
        String login = "cliente01";
        String senha = "012345";

        boolean temp = userDAO.checkLoginSenha(login, senha);
        Assert.assertEquals(temp, true);
    }

    @Test
    public void testCheckLoginFalso() throws DAOException {
        String login = "cliente01";
        String senha = "batata";

        boolean temp = userDAO.checkLoginSenha(login, senha);
        Assert.assertEquals(temp, false);
    }
}
