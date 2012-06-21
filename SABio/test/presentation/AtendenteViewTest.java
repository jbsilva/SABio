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
        String string = "";
        AtendenteView instance = new AtendenteView();
        boolean expResult = false;
        boolean result = instance.CheckCpf(string);
        assertEquals(expResult, result);
        
        string = "12345678901";
        expResult = true;
        result = instance.CheckCpf(string);
        assertEquals(expResult, result);
        
        string = "983632";
        expResult = false;
        result = instance.CheckCpf(string);
        assertEquals(expResult, result);
        
        
    }
}
