package mx.nestor;

public class Test {

	public static void main(String[] args) {
		/*Marcaria error si se crea un consutuctor sin parametros
		 * */
		Matematicas test = new Matematicas(3,5);
		System.out.println(test.multiplicar(3));
		System.out.println(test.multiplicar(4,"Su resultado es: "));
	}

}
