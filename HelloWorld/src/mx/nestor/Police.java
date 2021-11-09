package mx.nestor;

public class Police {
	/*Para acceder a los atributos y métodos de la Clase Person , 
	 * necesitamos crear una instancia */
	
	Person instancePerson = new Person();

	public void goToWalk() {
		/*Para acceder al método eat, lo hacemos a través 
		 * del nombre de la instancia */

		this.instancePerson.eat();
	}
}
