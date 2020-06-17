package rs.ac.bg.fon.ai.projekat.domen;

import java.util.Date;

public class Sat {
	private Date datum;
	private double temp;
	
	public Sat() {
		// TODO Auto-generated constructor stub
	}

	public Sat(Date datum, double temp) {
		super();
		this.datum = datum;
		this.temp = temp;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) throws Exception {
		if(datum == null) throw new Exception("Datum mora da postoji");
		this.datum = datum;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + (int)temp;
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
		Sat other = (Sat) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (temp != other.temp)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sat [datum=" + datum + ", temp=" + temp + "]";
	} 
	
	
	
}
