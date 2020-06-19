package rs.ac.bg.fon.ai.projekat.domen;

import java.util.Date;
/**
 * 
 * @author Ivan Stanimirovic
 *	
 * Domenska klasa u kojoj se nalazi jedan dan prognoze, ili trenutna temperatura
 */
public class Dan {
	
	private Date datum;
	private double trenutna;
	private double max;
	private double min;
	private String stanje;
	private double vetar;

	public Dan() {
		// TODO Auto-generated constructor stub
	}

	public Dan(Date datum, double trenutna, double max, double min,double vetar) {
		super();
		this.datum = datum;
		this.trenutna = trenutna;
		this.max = max;
		this.min = min;
		this.vetar = vetar;
	}

	/**
	 * Vraca vrednost privatnog atributa vetar
	 * @return vrednost atributa vetar
	 */
	public double getVetar() {
		return vetar;
	}

	/**
	 * Postavlja vrednost parametra vetar
	 * @param vetar predstavlja novu vrednost vetra
	 */
	public void setVetar(double vetar) {
		this.vetar = vetar;
	}
	/**
	 * Vraca vrednost atributa datum
	 * @return vrednost parametra datum
	 */
	public Date getDatum() {
		return datum;
	}
	/**
	 * Postavlja vrednost atributa datum
	 * @param datum predstavlja novu vrednost datuma koji ne sme da bude: 
	 * <ul>
	 * <li>null</li>
	 * </ul>
	 * @throws Exception ako parametar ne odgovara zadatim uslovima
	 */
	public void setDatum(Date datum) throws Exception {
		if(datum==null) throw new Exception("Datum mora da postoji");
		this.datum = datum;
	}
	/**
	 * Metoda getTrenutno vraca trenutnu temperaturu
	 * @return vrednost atributa trenutno
	 */
	public double getTrenutna() {
		return trenutna;
	}
	/**
	 * Postavlja vrednost atributa trenutno na prosledjenu
	 * @param trenutna poredstavlja novu trenutnu temperaturu
	 */
	public void setTrenutna(int trenutna) {
		this.trenutna = trenutna;
	}
	/**
	 * Metoda getMax vraca maximalnu temperaturu u tom danu
	 * @return vrednost atributa max
	 */
	public double getMax() {
		return max;
	}
	/**
	 * Metoda setMax postavlja vrednost atributa max na novu(prosledjenu) vrednost
	 * @param max predstavlja novu vrednost maksimalne temperature u tom danu
	 */
	public void setMax(int max) {
		this.max = max;
	}
	/**
	 * Metoda getMin vraca vrednost parametra min odnosno minimalnu temperaturu za taj dan
	 * @return vrednost parametra min
	 */
	public double getMin() {
		return min;
	}
	/**
	 * Metoda setMin postavlja vrednost atributa min na novu(prosledjenu) vrednost
	 * @param min prestavlja novu vrednost minimalne temperature
	 */
	public void setMin(int min) {
		this.min = min;
	}
	/**
	 * Metoda getStanje vraca vrednost atributa stanje, odnosno koje je stanje neba u tom trenutku
	 * @return vrednost atributa stanje
	 */
	public String getStanje() {
		return stanje;
	}
	/**
	 * Metoda setStanje postavlja vrednost atributa stanje na novu (prosledjenu vrednost)
	 * @param stanje predstavlja novu vrednost atributa stanje koji ne sme da bude: 
	 * <ul>
	 * <li>null</li>
	 * </ul>
	 * @throws Exception u slucaju da nisu ispostovani uslobi baca se izuzetak
	 */
	public void setStanje(String stanje) throws Exception {
		if(stanje==null) throw new Exception("Stanje mora da postoji");
		this.stanje = stanje;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(max);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(min);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((stanje == null) ? 0 : stanje.hashCode());
		temp = Double.doubleToLongBits(trenutna);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(vetar);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dan other = (Dan) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(max) != Double.doubleToLongBits(other.max))
			return false;
		if (Double.doubleToLongBits(min) != Double.doubleToLongBits(other.min))
			return false;
		if (stanje == null) {
			if (other.stanje != null)
				return false;
		} else if (!stanje.equals(other.stanje))
			return false;
		if (Double.doubleToLongBits(trenutna) != Double.doubleToLongBits(other.trenutna))
			return false;
		if (Double.doubleToLongBits(vetar) != Double.doubleToLongBits(other.vetar))
			return false;
		return true;
	}

	
	
}
