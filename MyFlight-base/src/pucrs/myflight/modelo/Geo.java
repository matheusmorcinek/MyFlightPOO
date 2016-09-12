package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;

	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	// Metodo para calcular a distancia entre
	// ESTA localizacao e a outra informada
	public double distancia(Geo outra) {
		// Geo obj = new Geo(this.latitude, this.logitude);
		return distancia(outra, this);
	}

	public static double distancia(Geo geo1, Geo geo2) {

		double lat1 = Math.toRadians(geo1.latitude);
		double lat2 = Math.toRadians(geo2.latitude);
		double lon1 = Math.toRadians(geo1.longitude);
		double lon2 = Math.toRadians(geo2.longitude);

		double diflat = (lat1 - lat2) / 2;
		double diflon = (lon1 - lon2) / 2;

		double resultado = Math.pow(Math.sin(diflat), 2)
				+ Math.pow(Math.sin(diflon), 2) * Math.cos(lat1) * Math.cos(lat2);

		resultado = 2 * 6371 * Math.asin(Math.sqrt(resultado));

		return resultado;

	}

}
