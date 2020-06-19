package rs.ac.bg.fon.ai.projekat.sesson;

import java.util.LinkedList;

import rs.ac.bg.fon.ai.projekat.domen.Dan;
import rs.ac.bg.fon.ai.projekat.domen.Grad;
import rs.ac.bg.fon.ai.projekat.domen.Sat;

/**
 * Klasa Sesson je singleton u kojoj su smesteni svi podaci u jednos sesiji
 * @author Ivan Stanimirovic
 *
 */
public class Sesson {

	private static Sesson instance;
	
	private LinkedList<Grad> gradovi;
	private LinkedList<Dan> poDanima;
	private LinkedList<Sat> poSatima;
	private Dan trenutno;
	
	private Sesson() {//naziv lon lat
		//kreiranje liste Gradova
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
	/**
	 * Metoda getInstance vraca staticku instancu klase Sesson
	 * @return instancu klase Sesson
	 */
	public static Sesson getInstance(){
		if(instance==null){
			instance = new Sesson();
		}
		return instance;
	}
	/**
	 * Metoda getGradovi vraca sve gradove iz liste gradovi
	 * @return vraca sve gradove iz liste gradovi
	 */
	public LinkedList<Grad> getGradovi() {
		return gradovi;
	}
	/**
	 * Metoda getPoDanima vraca listu sa prognozom za narednih 7 dana
	 * @return lista sa prognozom po danima
	 */
	public LinkedList<Dan> getPoDanima() {
		return poDanima;
	}
	/**
	 * Metoda setPoDanima postavlja novu listu prognoze za 7 dana
	 * @param poDanima predstavlja listu prognoze za 7 dana 
	 */
	public void setPoDanima(LinkedList<Dan> poDanima) {
		this.poDanima = poDanima;
	}
	/**
	 * Metoda getPoSatima vraca listu koja sadrzi prognozu po satima za konkretan dan
	 * @return listu sa podacima o prognozi po satima
	 */
	public LinkedList<Sat> getPoSatima() {
		return poSatima;
	}
	/**
	 * Metoda setPoSatima postavlja novu listu za prognozu po satima
	 * @param poSatima predstavlja novu listu prognoze po satima
	 */
	public void setPoSatima(LinkedList<Sat> poSatima) {
		this.poSatima = poSatima;
	}
	/**
	 * Metoda getTrenutno vraca trenutnu prognozu odnosno prognozu tog dana
	 * @return vraca instancu klase Dan sa podacima o trenutnoj prognozi
	 */
	public Dan getTrenutno() {
		return trenutno;
	}
	/**
	 * Metoda setTrenutno postavlja vrednost atributa trenutno na novu (prosledjenu) vrednost
	 * @param trenutno predstavlja novu trenutnu prognozu
	 */
	public void setTrenutno(Dan trenutno) {
		this.trenutno = trenutno;
	}
	
	
}
