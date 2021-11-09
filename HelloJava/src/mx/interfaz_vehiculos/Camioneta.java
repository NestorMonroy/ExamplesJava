package mx.interfaz_vehiculos;

public class Camioneta implements IVehiculo {

	@Override
	public void imprimirMotor() {
		System.out.println("C1000 CC");
	}

	@Override
	public void adeltante() {
		System.out.println("Camioneta - Adelante");
	}

	@Override
	public void reversa() {
		System.out.println("Camioneta - Adelante - Reversa");
	}

	@Override
	public void montarRuedas(int ruedas) {
		System.out.println("Camioneta - Se montaron " + ruedas + "ruedas");

	}

}
