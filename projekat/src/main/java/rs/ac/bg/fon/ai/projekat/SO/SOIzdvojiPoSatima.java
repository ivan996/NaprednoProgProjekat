package rs.ac.bg.fon.ai.projekat.SO;

import java.util.Date;
import java.util.LinkedList;

import org.json.JSONArray;
import org.json.JSONObject;

import rs.ac.bg.fon.ai.projekat.domen.Sat;
/**
 * Klasa sluzi za vrsenje sistemske operacije
 * @author Ivan Stanimirovic
 *
 */
public class SOIzdvojiPoSatima {
	/**
	 * Metoda izdvojiPoSatima na osnovu JSON objekta izdvaja prognozu po satima i vraca kao listu
	 * @param json predstavlja JSON objekat sa ucitanom prognozom
	 * @return vraca listu sa prognozom po satima
	 */
	public LinkedList<Sat> izdvojiPoSatima(JSONObject json){
		LinkedList<Sat> casovi = new LinkedList<Sat>();
		JSONArray sati = json.getJSONArray("hourly");
		for( int i = 0; i< sati.length(); i++){
			JSONObject obj = sati.getJSONObject(i);
			long date = obj.getLong("dt") * 1000;
			double temp = obj.getDouble("temp");
			Sat st = new Sat(new Date(date), temp);
			casovi.add(st);
		}
		return casovi;
	}
	
}
