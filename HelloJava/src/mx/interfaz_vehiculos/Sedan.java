package mx.interfaz_vehiculos;

/*Para utilizar una interfaz en una Clase, se emplea la palabra reservada implements*/
public class Sedan implements IVehiculo{

	/*En las implementaciones, al ser abstractas, 
	 * es necesario utilizar el decorador @Override*/
	
	@Override
	public void imprimirMotor() {
		System.out.println("Ultra 600MP");
	}

	@Override
	public void adeltante() {
		System.out.println("Sedan - Adelante");
		
	}

	@Override
	public void reversa() {
		System.out.println("Sedan - Reversa");
		
	}

	@Override
	public void montarRuedas(int ruedas) {
		System.out.println("Sedan - Se montaron " + ruedas + "ruedas");
		
	}

}
