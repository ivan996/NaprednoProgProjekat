package rs.ac.bg.fon.ai.projekat.SO;

import java.util.Date;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import rs.ac.bg.fon.ai.projekat.domen.Dan;
/**
 * Klasa sluzi za vrsenje sistemske operacije
 * @author Ivan Stanimirovic
 *
 */
public class SOIzdvojiTrenutno {
	/**
	 * Metoda izdvojiTrenutnu iz JSON objekta izdvaja trenutnu prognozu i vraca je kao instancu klase Dan
	 * @param json predtavlja ucitanu prognozu u vidu JSON objekta
	 * @return vraca instancu klase Dan sa trenutnom prognozom
	 */
	public Dan izdvojiTrenutnu(JSONObject json){		
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
		return dan;
		
	}

}
