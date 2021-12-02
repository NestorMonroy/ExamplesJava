package mx.mexbank;

public class TarjetaCredito extends CuentaBase {

	public TarjetaCredito(double montoApertura) {
		super(montoApertura * -1);

	}

	public void sumaInteres(double cantidad) {
		double resultado = this.getMontoApertura() + cantidad;
		double resultadoInteres = resultado * .15;
		resultado += resultadoInteres;
		this.setMontoApertura(resultado);
	}

}
