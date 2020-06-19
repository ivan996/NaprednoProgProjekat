package rs.ac.bg.fon.ai.projekat.controler;

import java.awt.Image;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;

import javax.swing.ImageIcon;

import org.json.JSONObject;

import rs.ac.bg.fon.ai.projekat.SO.SODodajMaluSliku;
import rs.ac.bg.fon.ai.projekat.SO.SODodajSliku;
import rs.ac.bg.fon.ai.projekat.SO.SOIzdvojiPoSatima;
import rs.ac.bg.fon.ai.projekat.SO.SOIzdvojiTrenutno;
import rs.ac.bg.fon.ai.projekat.SO.SOIzdvojiZaParDana;
import rs.ac.bg.fon.ai.projekat.SO.SOUcitajPrognozu;
import rs.ac.bg.fon.ai.projekat.domen.Dan;
import rs.ac.bg.fon.ai.projekat.domen.Grad;
import rs.ac.bg.fon.ai.projekat.domen.Sat;
import rs.ac.bg.fon.ai.projekat.sesson.Sesson;


/**
 * Klasa Controler je singleton koja se koristi za komunikaciju izmedju GUI-a i sistemskih operacija
 * @author Ivan Stanimirovic
 *
 */
public class Controler {

	private static Controler instance;
	private Controler() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Metoda getInstance vraca staticku instancu klase Controler
	 * @return instancu klase Controler
	 */
	public static Controler getInstance(){
		if(instance==null){
			instance = new Controler();
		}
		return instance;
	}
	/**
	 * Metoda ucitajPrognozu poziva sistemsku operaciju SOUcitajPrognozu koja ucitava prognozu i vraca nazad
	 * @param grad predstavlja grad koji se koristi da bi se dobila odgovarajuca prognoza
	 * @return boolean vrednost u zavisnosti da li je uspesno ucitana prognoza
	 */
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
	/**
	 * Metoda izdvojiTrenutnu poziva sistemsku operaciju SOIzdvojiTrenutno koja vraca trenutnu prognozu
	 * @param json predstavlja JSON objekat koji je dobijen sa API-ja
	 * @return vraca instancu klase Dan sa trenutnom prognozom
	 */
	public Dan izdvojiTrenutnu(JSONObject json){
		return new SOIzdvojiTrenutno().izdvojiTrenutnu(json);
	}
	/**
	 * Metoda izdvojiZaParDana poziva sistemsku operaciju SOIzdvojiZaParDana koja vraca listu sa prognozom za narednih 7 dna
	 * @param json predstavlja JSON objekat koji je dobijen sa API-ja
	 * @return vraca listu sa podacima prognoze za 7 dana
	 */
	public LinkedList<Dan> izdvojiZaParDana(JSONObject json){
		return new SOIzdvojiZaParDana().izdvojiZaParDana(json);
	}
	/**
	 * Metoda izdvojiPoSatima poziva sistemsku operaciju SOIzdvojiPoSatima koja vraca listu sa prognozom po satima
	 * @param json predstavlja JSON objekat koji je dobijen sa API-ja
	 * @return vraca listu sa podacima prognoze po satima
	 */
	public LinkedList<Sat> izdvojiPoSatima(JSONObject json){
		return new SOIzdvojiPoSatima().izdvojiPoSatima(json);
	}
	/**
	 * Metoda vratiSLiku poziva sistemsku operaiju SODodajSliku koja vraca instancu klase ImageIcon koja predstavlja trenutno stanje neba
	 * @param naziv predstavlja stanje neba u datom trenutku
	 * @return vraca instancu klase ImageIcon 
	 */
	public ImageIcon vratiSliku(String naziv){	
		return new SODodajSliku().vratiSliku(naziv);		
	}
	/**
	 * Metoda vratiMaluSliku poziva sistemsku operaiju SODodajMaluSliku koja vraca instancu klase ImageIcon koja predstavlja stanje neba u narednim danima
	 * @param naziv predstavlja stanje neba u datom trenutku
	 * @return vraca instancu klase ImageIcon 
	 */
	public ImageIcon vratiMaluSliku(String naziv){
		return new SODodajMaluSliku().vratiSliku(naziv);		
	}
	
	
	
}
