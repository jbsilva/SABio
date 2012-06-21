package presentation;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class AtendenteViewTest {
    
    public AtendenteViewTest() {
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
    public void testCheckCpf() {
        System.out.println("CheckCpf");
        String cpf = "";
        AtendenteView instance = new AtendenteView();
        boolean expResult = false;
        boolean result = instance.CheckCpf(cpf);
        assertEquals(expResult, result);
        
        cpf = "38852068899";
        expResult = true;
        result = instance.CheckCpf(cpf);
        assertEquals(expResult, result);
        
        cpf = "40899035809";
        expResult = true;
        result = instance.CheckCpf(cpf);
        assertEquals(expResult, result);
        
        cpf = "40899035809";
        expResult = true;
        result = instance.CheckCpf(cpf);
        assertEquals(expResult, result);
        
        cpf = "39377222893";
        expResult = true;
        result = instance.CheckCpf(cpf);
        assertEquals(expResult, result);
        
        cpf = "123345678";
        expResult = false;
        result = instance.CheckCpf(cpf);
        assertEquals(expResult, result);
        
        cpf = "12345678901";
        expResult = false;
        result = instance.CheckCpf(cpf);
        assertEquals(expResult, result);
        
        cpf = "123456789012";
        expResult = false;
        result = instance.CheckCpf(cpf);
        assertEquals(expResult, result);
        
    }
}
