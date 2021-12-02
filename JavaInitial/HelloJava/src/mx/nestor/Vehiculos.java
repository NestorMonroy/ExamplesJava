package mx.nestor;

public class Vehiculos {
	/*Para aplicar el encapusulamiento es necesario poner
	 * todos los atributos en private y generar los metodos
	 * get y set */
	
	private String tipoVehiculo;
	private int noLlantas;

	public void arrancar() {
		System.out.println("Arrancar");
	}

	private void encender() {
		System.out.println("Encender");
	}
	
	/*get y set : sirven para lectura y escritura*/

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public int getNoLlantas() {
		return noLlantas;
	}

	public void setNoLlantas(int noLlantas) {
		this.noLlantas = noLlantas;
	}
	
	
	
}
