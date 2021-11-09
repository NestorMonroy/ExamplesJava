package mx.operaciones;

public class Division extends Operacion{

	public Division(Double operando1, Double operando2) {
		super(operando1, operando2);
	}

	@Override
	Double resultado() {

		return this.getOperando1() / this.getOperando2();
	}
	

}
