/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl.jdbc;

import java.sql.ResultSet;
import org.junit.*;
import static org.junit.Assert.*;
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
        ObjectVO vo = null;
        UsuarioJDBCDAO instance = null;
        instance.insert(vo);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of update method, of class UsuarioJDBCDAO.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        ObjectVO vo = null;
        UsuarioJDBCDAO instance = null;
        instance.update(vo);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of delete method, of class UsuarioJDBCDAO.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        ObjectVO vo = null;
        UsuarioJDBCDAO instance = null;
        instance.delete(vo);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of selectByLogin method, of class UsuarioJDBCDAO.
     */
    @Test
    public void testSelectByLogin() throws Exception {
        System.out.println("selectByLogin");
        String login = "cliente01";
        UsuarioJDBCDAO instance = null;
        UsuarioVO expResult = null;
        UsuarioVO result = instance.selectByLogin(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of checkLoginSenha method, of class UsuarioJDBCDAO.
     */
    @Test
    public void testCheckLoginSenha() throws Exception {
        System.out.println("checkLoginSenha");
        String login = "cliente01";
        String senha = "012345";
        UsuarioJDBCDAO instance = null;
        boolean expResult = false;
        boolean result = instance.checkLoginSenha(login, senha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTableName method, of class UsuarioJDBCDAO.
     */
    @Test
    public void testGetTableName() {
        System.out.println("getTableName");
        UsuarioJDBCDAO instance = null;
        String expResult = "";
        String result = instance.getTableName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of createVO method, of class UsuarioJDBCDAO.
     */
    @Test
    public void testCreateVO() throws Exception {
        System.out.println("createVO");
        ResultSet rs = null;
        UsuarioJDBCDAO instance = null;
        ObjectVO expResult = null;
        ObjectVO result = instance.createVO(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
