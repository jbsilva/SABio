/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl.jdbc;

import java.sql.ResultSet;
import org.junit.*;
import static org.junit.Assert.*;
import sabio.SABioFactory;
import sabio.spec.IUsuario;
import vo.ObjectVO;
import vo.UsuarioVO;

public class UsuarioJDBCDAOTest {
    
    public UsuarioJDBCDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class UsuarioJDBCDAO.
     */
    @Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        SABioFactory factory = SABioFactory.getInstance();
        IUsuario Iuser = SABioFactory.getInstance().getUsuario();
        String login = "cli01433";
        String senha = "123";
        boolean result = false;
        boolean expResult = true;
        
        UsuarioVO user = new UsuarioVO (login,senha);
        factory.getUsuario().create(user);
        UsuarioVO user2 = Iuser.getUsuarioByLogin(login);
        
        if((user2.getLogin().equals(user.getLogin ())) && (user2.getSenha().equals(user.getSenha())))
            result = true;
        
        assertEquals(expResult, result);
        
        user2.setLogin("cli02");
        expResult = false;
        result = false;
        
        if((user2.getLogin().equals(user.getLogin ())) && (user2.getSenha().equals(user.getSenha())))
            result = true;
        
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
    }
}