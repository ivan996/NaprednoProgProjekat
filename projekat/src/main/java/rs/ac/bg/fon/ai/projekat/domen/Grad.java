package rs.ac.bg.fon.ai.projekat.domen;

public class Grad {

	private String nazivGrada;
	private double lon;
	private double lat;
	
	public Grad(String nazivGrada, double lon, double lat) {
		super();
		this.nazivGrada = nazivGrada;
		this.lon = lon;
		this.lat = lat;
	}
	public Grad() {
		nazivGrada = "";
		lon = 0;
		lat = 0;
	}
	public String getNazivGrada() {
		return nazivGrada;
	}
	public void setNazivGrada(String nazivGrada) throws Exception {
		if(nazivGrada == null || nazivGrada == "") throw new Exception("Grad mora da postoji");
		this.nazivGrada = nazivGrada;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) throws Exception {
		if(lon> 180 || lon < (-180)) throw new Exception("Los Lon");
		this.lon = lon;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) throws Exception {
		if(lat> 90 || lat < (-90)) throw new Exception("Los Lat");
		this.lat = lat;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(lat);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(lon);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nazivGrada == null) ? 0 : nazivGrada.hashCode());
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
		Grad other = (Grad) obj;
		if (Double.doubleToLongBits(lat) != Double.doubleToLongBits(other.lat))
			return false;
		if (Double.doubleToLongBits(lon) != Double.doubleToLongBits(other.lon))
			return false;
		if (nazivGrada == null) {
			if (other.nazivGrada != null)
				return false;
		} else if (!nazivGrada.equals(other.nazivGrada))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return nazivGrada;
	}
	
	
	
	//Beograd lat = 44.8 lon = 20.47
	//Nis lat = 43.7 lon 7.27
	//Novi Sad lon = 19.84 lat = 45.25
	//Kragujevac lon = 20.92 lat = 44.02
	//Krusevac lon = 21.33 lat = 43.58
	//Valjevo lon = 19.9 lat 44.28
	//Subotica lon 19.67 lat 46.1
	//Vranje lon 21.9 lat 42.55
	//Zlatibor lon 19.7 lat 43.72
	//Tara lon 74.37 lat 56.89
	//Kopaonik lon 20.81 lat 43.29
	
	
	
}
