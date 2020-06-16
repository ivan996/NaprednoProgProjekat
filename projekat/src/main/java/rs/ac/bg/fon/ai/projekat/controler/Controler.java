package rs.ac.bg.fon.ai.projekat.controler;

import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;

import org.json.JSONObject;

import rs.ac.bg.fon.ai.projekat.SO.SOIzdvojiPoSatima;
import rs.ac.bg.fon.ai.projekat.SO.SOIzdvojiTrenutno;
import rs.ac.bg.fon.ai.projekat.SO.SOIzdvojiZaParDana;
import rs.ac.bg.fon.ai.projekat.SO.SOUcitajPrognozu;
import rs.ac.bg.fon.ai.projekat.domen.Dan;
import rs.ac.bg.fon.ai.projekat.domen.Grad;
import rs.ac.bg.fon.ai.projekat.domen.Sat;
import rs.ac.bg.fon.ai.projekat.sesson.Sesson;

public class Controler {

	private static Controler instance;
	private Controler() {
		// TODO Auto-generated constructor stub
	}
	public static Controler getInstance(){
		if(instance==null){
			instance = new Controler();
		}
		return instance;
	}
	
	public boolean ucitajPrognozu(Grad grad){		
		try {
			SOUcitajPrognozu ucitaj = new SOUcitajPrognozu();
			JSONObject response = ucitaj.ucitajPrognozu(grad);
			Sesson.getInstance().setPoDanima(izdvojiZaParDana(response));
			Sesson.getInstance().setPoSatima(izdvojiPoSatima(response));
			Sesson.getInstance().setTrenutno(izdvojiTrenutnu(response));
			return true;	
		} catch (IOException e) {
			return false;
		}
	}
	public Dan izdvojiTrenutnu(JSONObject json){
		return new SOIzdvojiTrenutno().izdvojiTrenutnu(json);
	}
	public LinkedList<Dan> izdvojiZaParDana(JSONObject json){
		return new SOIzdvojiZaParDana().izdvojiZaParDana(json);
	}
	public LinkedList<Sat> izdvojiPoSatima(JSONObject json){
		return new SOIzdvojiPoSatima().izdvojiPoSatima(json);
	}
	
	
	
}
