package rs.ac.bg.fon.ai.projekat;

import static org.junit.Assert.*;

import java.io.FileReader;
import java.util.Date;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import rs.ac.bg.fon.ai.projekat.SO.SOIzdvojiTrenutno;
import rs.ac.bg.fon.ai.projekat.domen.Dan;

public class SOIzdvojiTrenutnoTest {
	
	String str;
	JSONObject json;

	@Before
	public void setUp() throws Exception {		
		FileReader in = new FileReader("JSONTrenutno.txt");
		String inputLine;
		StringBuffer response = new StringBuffer();
		Scanner myReader = new Scanner(in);
		while(myReader.hasNextLine()){
			response.append(myReader.nextLine());
		}		
		//System.out.println(response.toString());
		
		json = new JSONObject(response.toString());
	}

	@Test
	public void testIzdvojiTrenutnu() {
		JSONObject current = json.getJSONObject("current");
		long time = current.getLong("dt") * 1000;
		double temp = current.getDouble("temp");
		double wind = current.getDouble("wind_speed");
		Dan dan = new Dan(new Date(time), temp, 0, 0,wind);
		JSONArray weather = current.getJSONArray("weather");
		JSONObject obj = weather.getJSONObject(0);
		try {
			dan.setStanje(obj.getString("main"));
		}catch (Exception e) {			
		}
		
		assertEquals(new SOIzdvojiTrenutno().izdvojiTrenutnu(json), dan);
	}

}
