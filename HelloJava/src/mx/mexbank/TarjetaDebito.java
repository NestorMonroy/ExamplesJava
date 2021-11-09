package mx.mexbank;

public class TarjetaDebito extends CuentaBase{

	public TarjetaDebito(double montoApertura) {
		super(montoApertura);
	}

	public void retirar(double cantidad) {
		double resultadoRetirar = this.getMontoApertura() - cantidad;
		this.setMontoApertura(resultadoRetirar);
	}
}
