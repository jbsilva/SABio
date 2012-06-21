/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl.jdbc;

import java.sql.ResultSet;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import vo.AvaliacaoFisicaVO;
import vo.ObjectVO;

/**
 *
 * @author Andre
 */
public class AvaliacaoFisicaJDBCDAOTest {
    
    public AvaliacaoFisicaJDBCDAOTest() {
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
     * Test of insert method, of class AvaliacaoFisicaJDBCDAO.
     */
    @Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        ObjectVO vo = null;
        AvaliacaoFisicaJDBCDAO instance = null;
        instance.insert(vo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AvaliacaoFisicaJDBCDAO.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        ObjectVO vo = null;
        AvaliacaoFisicaJDBCDAO instance = null;
        instance.update(vo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AvaliacaoFisicaJDBCDAO.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        AvaliacaoFisicaVO vo = null;
        AvaliacaoFisicaJDBCDAO instance = null;
        instance.delete(vo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SelectById method, of class AvaliacaoFisicaJDBCDAO.
     */
    @Test
    public void testSelectById() throws Exception {
        System.out.println("SelectById");
        int avaliacao_id = 0;
        AvaliacaoFisicaJDBCDAO instance = null;
        AvaliacaoFisicaVO expResult = null;
        AvaliacaoFisicaVO result = instance.SelectById(avaliacao_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SelectAll method, of class AvaliacaoFisicaJDBCDAO.
     */
    @Test
    public void testSelectAll() throws Exception {
        System.out.println("SelectAll");
        AvaliacaoFisicaJDBCDAO instance = null;
        List expResult = null;
        List result = instance.SelectAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTableName method, of class AvaliacaoFisicaJDBCDAO.
     */
    @Test
    public void testGetTableName() {
        System.out.println("getTableName");
        AvaliacaoFisicaJDBCDAO instance = null;
        String expResult = "";
        String result = instance.getTableName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVO method, of class AvaliacaoFisicaJDBCDAO.
     */
    @Test
    public void testCreateVO() throws Exception {
        System.out.println("createVO");
        ResultSet rs = null;
        AvaliacaoFisicaJDBCDAO instance = null;
        AvaliacaoFisicaVO expResult = null;
        AvaliacaoFisicaVO result = instance.createVO(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AvaliacaoFisicaJDBCDAOImpl extends AvaliacaoFisicaJDBCDAO {

        public AvaliacaoFisicaJDBCDAOImpl() throws Exception {
            super(null);
        }
    }
}
