package dao.impl.jdbc;

import java.util.Calendar;
import org.junit.*;
import static org.junit.Assert.*;
import sabio.SABioFactory;
import sabio.spec.IAvaliacaoFisica;
import sabio.spec.ICliente;
import sabio.spec.IInstrutor;
import vo.AvaliacaoFisicaVO;
import vo.ClienteVO;
import vo.InstrutorVO;
import vo.UsuarioVO;

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

    @Test
    public void testInsert() throws Exception {

        SABioFactory factory = SABioFactory.getInstance();
        IInstrutor Iinst = SABioFactory.getInstance().getInstrutor();
        ICliente Icliente = SABioFactory.getInstance().getCliente();
        IAvaliacaoFisica Iaf = SABioFactory.getInstance().getAvaliacaoFisica();
        
        String login = "cli1123";
        String senha = "123";
        String nome = "23232";
        String cpf = "121";
        String rg = "1212";
        Calendar data_contratacao = Calendar.getInstance();
        String endereco = "23";
        String registro_profissional = "232";
        String numero_carteira_trabalho = "12";
        int carga_horaria = 1;
        int id = 123;
        Calendar data_ingresso = Calendar.getInstance();
        String mensalidades_abertas = "Agosto";
        String telefone = "3451567";
        Calendar data_nascimento = Calendar.getInstance();
        String atestado_medico = "em dia";
        String observacoes = "nenhuma";
        
        boolean status = false;
        boolean result = false;
        boolean expResult = true;

        UsuarioVO user = new UsuarioVO(login, senha);
        InstrutorVO instrutor = new InstrutorVO(user,
                nome,
                cpf,
                data_contratacao,
                rg,
                endereco,
                registro_profissional,
                numero_carteira_trabalho,
                carga_horaria);
        
        ClienteVO cliente = new ClienteVO(user, nome, cpf, rg, telefone,
                atestado_medico, data_ingresso, mensalidades_abertas, data_nascimento,
                status);
        AvaliacaoFisicaVO af = new AvaliacaoFisicaVO(cliente, instrutor, id, data_ingresso, observacoes);
        
        factory.getUsuario().create(user);
        factory.getInstrutor().create(instrutor);
        factory.getCliente().create(cliente);
        factory.getAvaliacaoFisica().create(af);
        AvaliacaoFisicaVO af2 = Iaf.getAvaliacaoFisicaById(id);

        if (af2.getCliente().getUsuario().getLogin().equals(af.getCliente().getUsuario().getLogin()) && af2.getInstrutor().getUsuario().getLogin().equals(af.getInstrutor().getUsuario().getLogin())) {
            result = true;
        }

        assertEquals(expResult, result);
    }
}
