package rs.ac.bg.fon.ai.projekat.sesson;

import java.util.LinkedList;

import rs.ac.bg.fon.ai.projekat.domen.Grad;

public class Sesson {

	public static Sesson instance;
	
	LinkedList<Grad> gradovi;
	private Sesson() {//naziv lon lat
		gradovi = new LinkedList<Grad>();
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
	
	public Sesson getInstance(){
		if(instance==null){
			instance = new Sesson();
		}
		return instance;
	}
}
