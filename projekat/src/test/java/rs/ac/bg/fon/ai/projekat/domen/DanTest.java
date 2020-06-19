package rs.ac.bg.fon.ai.projekat.domen;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class DanTest {

	Dan d;
	@Before
	public void setUp() throws Exception {
		d = new Dan();
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

	@Test
	public void testSetStanje() throws Exception {
		d.setStanje("provera");
		String test = "provera";
		assertEquals(d.getStanje(), test);
	}
	
	@Test(expected = Exception.class)
	public void testSetStanjeNull() throws Throwable {
		d.setStanje(null);
	}

}
