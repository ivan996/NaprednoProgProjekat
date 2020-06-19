package rs.ac.bg.fon.ai.projekat;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import rs.ac.bg.fon.ai.projekat.SO.SOIzdvojiPoSatima;
import rs.ac.bg.fon.ai.projekat.SO.SOUcitajPrognozu;
import rs.ac.bg.fon.ai.projekat.domen.Grad;

public class SoUcitajPrognozuTest {
	
	String url;
	URL obj;
	HttpURLConnection con;
	Grad grad;
	JSONObject json;

	@Before
	public void setUp() throws Exception {
		grad = new Grad("Beograd", 20.47, 44.8);
		String url = "https://api.openweathermap.org/data/2.5/onecall?lat="+ grad.getLat() +"&lon="+ grad.getLon() +"&appid=1814c32996f523224b9ad9f8930e305f&units=metric";
		URL obj;
		obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		
		int responseCode = con.getResponseCode();
		if(responseCode!= 200) throw new IOException();
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		
		while((inputLine = in.readLine())!=null){
			response.append(inputLine);
		}
		
		json = new JSONObject(response.toString());	
		
		in.close();
	}

	@Test
	public void testUcitajPrognozu() throws IOException {
		
		JSONObject obj  = new SOUcitajPrognozu().ucitajPrognozu(grad);
		JSONObject current = obj.getJSONObject("current");
		JSONObject novi = json.getJSONObject("current");
		assertEquals(String.valueOf(current.getDouble("temp")), String.valueOf(novi.getDouble("temp")));
	}

}
