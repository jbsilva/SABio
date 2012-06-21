/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl.jdbc;

import java.util.Calendar;
import org.junit.*;
import static org.junit.Assert.*;
import sabio.SABioFactory;
import sabio.spec.IInstrutor;
import vo.InstrutorVO;
import vo.UsuarioVO;

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

    @Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        
        SABioFactory factory = SABioFactory.getInstance();
        IInstrutor Iinst = SABioFactory.getInstance().getInstrutor();
        String login = "cli01243233";
        String senha = "123";
        boolean result = false;
        boolean expResult = true;
        String nome = "23232";
        String cpf = "121";
        String rg = "1212";
        Calendar data_contratacao = Calendar.getInstance();
        String endereco = "23";
        String registro_profissional = "232";
        String numero_carteira_trabalho = "12";
        int carga_horaria = 1;


        UsuarioVO user = new UsuarioVO(login, senha);
        InstrutorVO inst = new InstrutorVO(user,
                nome,
                cpf,
                data_contratacao,
                rg,
                endereco,
                registro_profissional,
                numero_carteira_trabalho,
                carga_horaria);
        
        factory.getUsuario().create(user);
        factory.getInstrutor().create(inst);
        InstrutorVO inst2 = Iinst.getInstrutorByLogin(login);

        if (inst2.getUsuario().getLogin().equals(inst.getUsuario().getLogin()) && inst2.getCPF().equals(inst.getCPF())) {
            result = true;
        }

        assertEquals(expResult, result);
    }
}

