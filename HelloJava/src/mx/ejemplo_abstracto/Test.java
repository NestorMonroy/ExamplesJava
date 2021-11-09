package mx.ejemplo_abstracto;

public class Test {

	public static void main(String[] args) {
		
		Perro perro = new Perro("Perro 1");
		Gato gato = new Gato("Gato 1");
		
		perro.imprimirNombre();
		perro.sonido();
		
		gato.imprimirNombre();
		gato.sonido();

	}

}
