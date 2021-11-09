package mx.operaciones;

public abstract class Operacion {

	private Double operando1;
	private Double operando2;

	public Operacion(Double operando1, Double operando2) {
		super();
		this.operando1 = operando1;
		this.operando2 = operando2;
	}

	abstract Double resultado();

	public Double getOperando1() {
		return operando1;
	}

	public Double getOperando2() {
		return operando2;
	}

	public void imprimir() {
		System.out.println("El resultado es: " + this.resultado() );
	}
}
