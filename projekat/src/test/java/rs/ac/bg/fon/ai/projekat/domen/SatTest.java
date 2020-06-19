package rs.ac.bg.fon.ai.projekat.domen;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class SatTest {

	Sat d;
	
	@Before
	public void setUp() throws Exception {
		d = new Sat();
	}

	@Test
	public void testSetDatum() throws Exception {
		d.setDatum(new Date(1592551626 * 1000));
		Date datum = new Date(1592551626 * 1000);
		assertEquals(d.getDatum(), datum);
	}
	
	@Test(expected = Exception.class)
	public void testSetDatumNull() throws Exception {
		d.setDatum(null);
	}

}
