package rs.ac.bg.fon.ai.projekat.SO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

import rs.ac.bg.fon.ai.projekat.domen.Grad;
/**
 * Klasa sluzi za vrsenje sistemske operacije
 * @author Ivan Stanimirovic
 *
 */
public class SOUcitajPrognozu {
	/**
	 * Metoda ucitajPrognozu konektuje se na API, cita JSON i vraca prognozu
	 * @param grad predstavlja naziv grada za koji nam je potreba prognoza
	 * @return vraca instancu klase JSONObject koja predstavlja prognozu
	 * @throws IOException u slucaju da dodje do greske baca se IOException
	 */
	public JSONObject ucitajPrognozu(Grad grad) throws IOException{
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
		
		//System.out.println(response.toString());
		
		JSONObject json = new JSONObject(response.toString());	
		
		in.close();
		
		return json;
		
		
	}
	
}
