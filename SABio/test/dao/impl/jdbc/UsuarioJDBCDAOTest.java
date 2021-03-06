package dao.impl.jdbc;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import sabio.SABioFactory;
import sabio.spec.IUsuario;
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
        
    }
}