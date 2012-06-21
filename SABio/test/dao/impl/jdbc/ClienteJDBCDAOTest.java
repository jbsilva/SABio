/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl.jdbc;

import java.sql.ResultSet;
import java.util.Calendar;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import sabio.SABioFactory;
import sabio.spec.ICliente;
import vo.ClienteVO;
import vo.ObjectVO;
import vo.UsuarioVO;

/**
 *
 * @author Andre
 */
public class ClienteJDBCDAOTest {
    
    public ClienteJDBCDAOTest() {
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
     * Test of insert method, of class ClienteJDBCDAO.
     */
    @Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        SABioFactory factory = SABioFactory.getInstance();
        ICliente Icliente = SABioFactory.getInstance().getCliente();
        String login = "Andre1235";
        String senha = "123";
        String nome_cliente = "Joao";
        String cpf = "1234567810";
        String rg = "12223";
        Calendar data_ingresso = Calendar.getInstance();
        String mensalidades_abertas = "Agosto";
        String telefone = "3451567";
        Calendar data_nascimento = Calendar.getInstance();
        boolean status = false;
        String atestado_medico = "Bunda";
        
        boolean result = false;
        boolean expResult = true;
        
        UsuarioVO user = new UsuarioVO (login,senha);
        ClienteVO cliente = new ClienteVO (user,nome_cliente,cpf,rg,telefone,
            atestado_medico, data_ingresso,mensalidades_abertas,data_nascimento,
             status);
        
        factory.getUsuario().create(user);
        factory.getCliente().create(cliente);
        ClienteVO cliente2 = Icliente.getClienteByLogin(login);
        
        if(cliente.getUsuario().getLogin().equals(cliente2.getUsuario().getLogin()) && cliente.getCPF().equals(cliente2.getCPF()))
            result = true;
        
        assertEquals(expResult, result);
       
    }

    /**
     * Test of update method, of class ClienteJDBCDAO.
     */
   // @Test
   /* public void testUpdate() throws Exception {
        System.out.println("update");
        ObjectVO vo = null;
        ClienteJDBCDAO instance = null;
        instance.update(vo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ClienteJDBCDAO.
     */
    /*@Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        ClienteVO vo = null;
        ClienteJDBCDAO instance = null;
        instance.delete(vo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
}