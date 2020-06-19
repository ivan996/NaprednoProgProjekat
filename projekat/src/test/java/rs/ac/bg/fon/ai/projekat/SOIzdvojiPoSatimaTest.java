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
import rs.ac.bg.fon.ai.projekat.domen.Sat;

public class SOIzdvojiPoSatimaTest {
	
	String str;
	JSONObject json;

	@Before
	public void setUp() throws Exception {
		FileReader in = new FileReader("JSON.txt");
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
	public void testIzdvojiPoSatima() {
		LinkedList<Sat> casovi = new LinkedList<Sat>();
		JSONArray sati = json.getJSONArray("hourly");
		for( int i = 0; i< sati.length(); i++){
			JSONObject obj = sati.getJSONObject(i);
			long date = obj.getLong("dt") * 1000;
			double temp = obj.getDouble("temp");
			Sat st = new Sat(new Date(date), temp);
			casovi.add(st);
		}
		assertEquals(new SOIzdvojiPoSatima().izdvojiPoSatima(json), casovi);
		
	}

}
