package rs.ac.bg.fon.ai.projekat.sesson;

import java.util.LinkedList;

import rs.ac.bg.fon.ai.projekat.domen.Dan;
import rs.ac.bg.fon.ai.projekat.domen.Grad;
import rs.ac.bg.fon.ai.projekat.domen.Sat;

public class Sesson {

	private static Sesson instance;
	
	private LinkedList<Grad> gradovi;
	private LinkedList<Dan> poDanima;
	private LinkedList<Sat> poSatima;
	private Dan trenutno;
	
	private Sesson() {//naziv lon lat
		gradovi = new LinkedList<Grad>();
		poDanima = new LinkedList<Dan>();
		poSatima = new LinkedList<Sat>();
		trenutno = new Dan();
		gradovi.add(new Grad("Beograd", 20.47, 44.8));
		gradovi.add(new Grad("Nis", 7.27, 43.7));
		gradovi.add(new Grad("Novi Sad", 19.84, 45.25));
		gradovi.add(new Grad("Kragujevac", 20.92, 44.02));
		gradovi.add(new Grad("Krusevac", 21.33, 43.58));
		gradovi.add(new Grad("Valjevo", 19.9, 44.28));
		gradovi.add(new Grad("Subotica", 19.67, 46.1));
		gradovi.add(new Grad("Vranje", 21.9, 42.55));
		gradovi.add(new Grad("Zlatibor", 19.7, 43.72));
		gradovi.add(new Grad("Tara", 74.37, 56.89));
		gradovi.add(new Grad("Kopaonik", 20.81, 43.29));
	}
	
	public static Sesson getInstance(){
		if(instance==null){
			instance = new Sesson();
		}
		return instance;
	}
	
	public LinkedList<Grad> getGradovi() {
		return gradovi;
	}

	public LinkedList<Dan> getPoDanima() {
		return poDanima;
	}

	public void setPoDanima(LinkedList<Dan> poDanima) {
		this.poDanima = poDanima;
	}

	public LinkedList<Sat> getPoSatima() {
		return poSatima;
	}

	public void setPoSatima(LinkedList<Sat> poSatima) {
		this.poSatima = poSatima;
	}

	public Dan getTrenutno() {
		return trenutno;
	}

	public void setTrenutno(Dan trenutno) {
		this.trenutno = trenutno;
	}
	
	
}
