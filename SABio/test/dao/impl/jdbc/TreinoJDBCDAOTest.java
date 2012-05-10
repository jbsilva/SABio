/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl.jdbc;

import java.sql.ResultSet;
import org.junit.*;
import static org.junit.Assert.*;
import vo.ObjectVO;
import vo.TreinoVO;

/**
 *
 * @author Andre
 */
public class TreinoJDBCDAOTest {
    
    public TreinoJDBCDAOTest() {
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
     * Test of insert method, of class TreinoJDBCDAO.
     */
    @Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        ObjectVO vo = null;
        TreinoJDBCDAO instance = null;
        instance.insert(vo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TreinoJDBCDAO.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        ObjectVO vo = null;
        TreinoJDBCDAO instance = null;
        instance.update(vo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TreinoJDBCDAO.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        ObjectVO vo = null;
        TreinoJDBCDAO instance = null;
        instance.delete(vo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectByLogin method, of class TreinoJDBCDAO.
     */
    @Test
    public void testSelectByLogin() throws Exception {
        System.out.println("selectByLogin");
        String Login = "";
        TreinoJDBCDAO instance = null;
        TreinoVO expResult = null;
        TreinoVO result = instance.selectByLogin(Login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectByTreinoId method, of class TreinoJDBCDAO.
     */
    @Test
    public void testSelectByTreinoId() throws Exception {
        System.out.println("selectByTreinoId");
        int treino_id = 0;
        TreinoJDBCDAO instance = null;
        TreinoVO expResult = null;
        TreinoVO result = instance.selectByTreinoId(treino_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTableName method, of class TreinoJDBCDAO.
     */
    @Test
    public void testGetTableName() {
        System.out.println("getTableName");
        TreinoJDBCDAO instance = null;
        String expResult = "";
        String result = instance.getTableName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVO method, of class TreinoJDBCDAO.
     */
    @Test
    public void testCreateVO() throws Exception {
        System.out.println("createVO");
        ResultSet rs = null;
        TreinoJDBCDAO instance = null;
        ObjectVO expResult = null;
        ObjectVO result = instance.createVO(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
