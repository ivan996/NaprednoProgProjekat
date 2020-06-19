package rs.ac.bg.fon.ai.projekat;

import static org.junit.Assert.*;

import java.io.FileReader;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import rs.ac.bg.fon.ai.projekat.SO.SOIzdvojiPoSatima;
import rs.ac.bg.fon.ai.projekat.SO.SOIzdvojiZaParDana;
import rs.ac.bg.fon.ai.projekat.domen.Dan;

public class SOIzdvojiZaParDanaTest {
	
	String str;
	JSONObject json;

	@Before
	public void setUp() throws Exception {		
		FileReader in = new FileReader("JSONDani.txt");
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
	public void testIzdvojiZaParDana() {
		LinkedList<Dan> dan = new LinkedList<Dan>();
		JSONArray dani = json.getJSONArray("daily");
		for( int i = 0; i< dani.length(); i++){			
			JSONObject obj = dani.getJSONObject(i);
			long date = obj.getLong("dt") * 1000 ;
			JSONObject temp = obj.getJSONObject("temp");
			double min = temp.getDouble("min");
			double max = temp.getDouble("max");
			Dan d = new Dan(new Date(date), 0, max, min,0);
			JSONArray weather = obj.getJSONArray("weather");
			JSONObject main = weather.getJSONObject(0);
			try {
				d.setStanje(main.getString("main"));
			}catch (Exception e) {}
			dan.add(d);
		}
		assertEquals(new SOIzdvojiZaParDana().izdvojiZaParDana(json), dan);
		
	}

}
