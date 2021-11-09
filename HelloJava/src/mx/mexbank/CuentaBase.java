package mx.mexbank;

public class CuentaBase {
	private double montoApertura;

	public CuentaBase() {
	}

	public CuentaBase(double montoApertura) {
		this.montoApertura = montoApertura;
	}

	public double getMontoApertura() {
		return montoApertura;
	}

	public void setMontoApertura(double montoApertura) {
		this.montoApertura = montoApertura;
	}

	public void depositar(double cantidad) {
		double resultado = this.getMontoApertura() + cantidad;
		this.setMontoApertura(resultado);
	}
}
