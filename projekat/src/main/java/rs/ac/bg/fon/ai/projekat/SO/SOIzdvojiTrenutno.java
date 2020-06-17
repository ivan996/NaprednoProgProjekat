package rs.ac.bg.fon.ai.projekat.SO;

import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;

import rs.ac.bg.fon.ai.projekat.domen.Dan;

public class SOIzdvojiTrenutno {
	
	public Dan izdvojiTrenutnu(JSONObject json){
		
		JSONObject current = json.getJSONObject("current");
		long time = current.getLong("dt") * 1000;
		double temp = current.getDouble("temp");
		double wind = current.getDouble("wind_speed");
		Dan dan = new Dan(new Date(time), temp, 0, 0,wind);
		JSONArray weather = current.getJSONArray("weather");
		JSONObject obj = weather.getJSONObject(0);
		dan.setStanje(obj.getString("main"));
		return dan;
	}

}
