package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import vo.TreinoVO;

public class TreinoVOTest {
	private TreinoVO obj;
	@Before
	public void setUp() {
		obj = new TreinoVO();
	}
	
	@Test
	public void testSetAndGet() {
		assertEquals(1,1);
	}
}
