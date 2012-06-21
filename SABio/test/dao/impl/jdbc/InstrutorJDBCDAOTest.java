/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl.jdbc;

import java.sql.ResultSet;
import org.junit.*;
import static org.junit.Assert.*;
import vo.InstrutorVO;
import vo.ObjectVO;

/**
 *
 * @author Andre
 */
public class InstrutorJDBCDAOTest {
    
    public InstrutorJDBCDAOTest() {
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
     * Test of insert method, of class InstrutorJDBCDAO.
     */
    @Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        ObjectVO vo = null;
        InstrutorJDBCDAO instance = null;
        instance.insert(vo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class InstrutorJDBCDAO.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        ObjectVO vo = null;
        InstrutorJDBCDAO instance = null;
        instance.update(vo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class InstrutorJDBCDAO.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        InstrutorVO vo = null;
        InstrutorJDBCDAO instance = null;
        instance.delete(vo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
