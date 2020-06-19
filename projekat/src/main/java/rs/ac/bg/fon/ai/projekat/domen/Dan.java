package rs.ac.bg.fon.ai.projekat.domen;

import java.util.Date;

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

	
	
	public double getVetar() {
		return vetar;
	}

	public void setVetar(double vetar) {
		this.vetar = vetar;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) throws Exception {
		if(datum==null) throw new Exception("Datum mora da postoji");
		this.datum = datum;
	}

	public double getTrenutna() {
		return trenutna;
	}

	public void setTrenutna(int trenutna) {
		this.trenutna = trenutna;
	}

	public double getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public double getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	

	public String getStanje() {
		return stanje;
	}

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
