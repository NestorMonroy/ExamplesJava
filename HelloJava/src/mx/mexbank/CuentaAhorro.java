package mx.mexbank;

public class CuentaAhorro extends CuentaBase {

	public CuentaAhorro(double montoApertura) {
		super(montoApertura);

	}

	public void invertir(double cantidad) {
		double resultado = this.getMontoApertura() + cantidad;
		double resultadoInteres = resultado * .10;
		resultado += resultadoInteres;
		this.setMontoApertura(resultado);
	}
}
