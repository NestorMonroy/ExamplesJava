package mx.mexbank;

public class MexBank {
	public static void main(String[] args) {
		CuentaAhorro ca = new CuentaAhorro(50.0);
		
		System.out.println("CuentaAhorro inicial: " + ca.getMontoApertura());
		ca.depositar(10);
		System.out.println("CuentaAhorro mas deposito: " + ca.getMontoApertura());
		ca.invertir(20.5);
		System.out.println("CuentaAhorro con inversion: " + ca.getMontoApertura());
		System.out.println("------");
		System.out.println("------");
		
		TarjetaCredito tc = new TarjetaCredito(30);
		System.out.println("TarjetaCredito inicial: " + tc.getMontoApertura());
		tc.depositar(10);
		System.out.println("TarjetaCredito mas deposito: " + tc.getMontoApertura());
		tc.sumaInteres(30.9);
		System.out.println("TarjetaCredito con sumaInteres: " + tc.getMontoApertura());
		System.out.println("------");
		System.out.println("------");
		
		
		TarjetaDebito td = new TarjetaDebito(18.9);
		System.out.println("TarjetaDebito inicial: " + td.getMontoApertura());
		td.depositar(100);
		System.out.println("TarjetaDebito mas deposito: " + td.getMontoApertura());
		td.retirar(10.9);
		System.out.println("TarjetaDebito con retiro: " + td.getMontoApertura());
	}
}

