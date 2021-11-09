package mx.interfaz_vehiculos;

public class Test {

	public static void main(String[] args) {
		Camioneta camioneta = new Camioneta();
		camioneta.imprimirMotor();
		
		Moto moto = new Moto();
		moto.imprimirMotor();
		
		Sedan sedan = new Sedan();
		sedan.imprimirMotor();
	}

}
