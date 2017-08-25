import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CaixaTest {
	private Caixa c;

	@Before
	public void setUp() throws Exception {
		c = new Caixa(1);

	}

	@Test
	public void testCaixa() {

		Assert.assertEquals(1, c.getId());
	}

	@Test
	public void testGetId() {
		Assert.assertEquals(1, c.getId());
	}

}
