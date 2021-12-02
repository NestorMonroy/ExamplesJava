package mx.operaciones;

public class Multiplicacion extends Operacion{

	public Multiplicacion(Double operando1, Double operando2) {
		super(operando1, operando2);
		
	}

	@Override
	Double resultado() {
		return this.getOperando1() * this.getOperando2();
	}


}
