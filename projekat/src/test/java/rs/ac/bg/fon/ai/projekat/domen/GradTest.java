package rs.ac.bg.fon.ai.projekat.domen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GradTest {

	Grad g;
	
	@Before
	public void setUp() throws Exception {
		g = new Grad();
	}

	@Test
	public void testSetNazivGrada() throws Exception {
		g.setNazivGrada("Beograd");
		String test = "Beograd";
		assertEquals(g.getNazivGrada(), test);
	}
	
	@Test(expected = Exception.class)
	public void testSetNazivGradaNull() throws Exception {
		g.setNazivGrada(null);
	}
	
	@Test(expected = Exception.class)
	public void testSetNazivGradaEmptyString() throws Exception {
		g.setNazivGrada("");
	}

	@Test
	public void testSetLon() throws Exception {
		g.setLon(45.0);
		String lo = "45.0";
		assertEquals(String.valueOf(g.getLon()), lo);
	}
	
	@Test(expected = Exception.class)
	public void testSetLonOver() throws Exception {
		g.setLon(190.0);
	}

	@Test
	public void testSetLat() throws Exception {
		g.setLat(45.0);
		String lat = "45.0";
		String newLat = String.valueOf(g.getLat());
		assertEquals(String.valueOf(g.getLat()), lat);
	}
	
	@Test(expected = Exception.class)
	public void testSetLatOver() throws Exception {
		g.setLat(100.0);
	}

}
