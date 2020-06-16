package rs.ac.bg.fon.ai.projekat.SO;

import java.util.Date;
import java.util.LinkedList;

import org.json.JSONArray;
import org.json.JSONObject;

import rs.ac.bg.fon.ai.projekat.domen.Dan;

public class SOIzdvojiZaParDana {
	
	public LinkedList<Dan> izdvojiZaParDana(JSONObject json){
		LinkedList<Dan> dan = new LinkedList<Dan>();
		JSONArray dani = json.getJSONArray("daily");
		for( int i = 0; i< dani.length(); i++){			
			JSONObject obj = dani.getJSONObject(i);
			long date = obj.getLong("dt");
			JSONObject temp = obj.getJSONObject("temp");
			double min = temp.getDouble("min");
			double max = temp.getDouble("max");
			Dan d = new Dan(new Date(date), 0, max, min);
			dan.add(d);
		}
		
		return dan;
	}

}
