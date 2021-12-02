package mx.interfaz_vehiculos;

public class Moto implements IVehiculo {

	@Override
	public void imprimirMotor() {
		System.out.println("CG200 CC");
	}

	@Override
	public void adeltante() {
		System.out.println("Moto - Adelante");
	}

	@Override
	public void reversa() {
		System.out.println("Moto - Adelante - Reversa");

	}

	@Override
	public void montarRuedas(int ruedas) {
		System.out.println("Moto - Se montaron " + ruedas + "ruedas");

	}

}
