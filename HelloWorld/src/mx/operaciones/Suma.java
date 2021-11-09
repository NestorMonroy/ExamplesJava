package mx.operaciones;

public class Suma extends Operacion{

	public Suma(Double operando1, Double operando2) {
		super(operando1, operando2);
	}

	@Override
	Double resultado() {
		return this.getOperando1() + this.getOperando2();
	}


}
