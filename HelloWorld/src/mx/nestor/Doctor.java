package mx.nestor;

public class Doctor extends Person{
	
	public static void main(String[] args) {
		/* También, podemos acceder a los métodos y atributos de la Clase 
		 * Person mediante la instancia de la Clase Doctor como se muestra 
		 * en el código*/
		Doctor doctor = new Doctor();
		doctor.walk();
		doctor.eat();
	}
}
