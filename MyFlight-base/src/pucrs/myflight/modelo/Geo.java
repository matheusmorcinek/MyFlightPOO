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
	
	public double distancia(Geo outra){
		//Geo obj = new Geo(this.latitude, this.logitude);
		return distancia(outra, this);
	}

	public static double distancia(Geo geo1, Geo geo2) {

		double resultado;
		
		double raioTerra = 6371;
		
		double lat1 = geo1.getLatitude();
		double long1 = geo1.getLongitude();
		
		double lat2 = geo2.getLatitude();
		double long2 = geo2.getLongitude();
		

		//resultado primeiro sin²(lat1 - lat2)/2
		
		double resultadoSeno1 = (Math.toRadians(lat1) - Math.toRadians(lat2))/2;
		
		double resultadoSeno2 = (Math.toRadians(long1) - Math.toRadians(long2))/2;
		
		
		//falta raiz
		double resutadoParentese = Math.sqrt(
				
										Math.pow(Math.sin(Math.toRadians(resultadoSeno1)),2) + 
										
										Math.pow(Math.sin(Math.toRadians(resultadoSeno2)),2) *
										
										
										Math.cos(Math.toRadians(lat1)) * 
										
										Math.cos(Math.toRadians(lat2))
										
											); 
		
		
		resultado = (2 * raioTerra) * Math.asin(resutadoParentese);
				

		return resultado;
	}

}
