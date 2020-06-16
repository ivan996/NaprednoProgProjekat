package rs.ac.bg.fon.ai.projekat.SO;

import java.util.Date;

import org.json.JSONObject;

import rs.ac.bg.fon.ai.projekat.domen.Dan;

public class SOIzdvojiTrenutno {
	
	public Dan izdvojiTrenutnu(JSONObject json){
		
		JSONObject current = json.getJSONObject("current");
		long time = current.getLong("dt");
		double temp = current.getDouble("temp");
		Dan dan = new Dan(new Date(time), temp, 0, 0);
		
		return dan;
	}

}
