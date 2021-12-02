package mx.ejemplo_abstracto;

public class Gato extends Animal{

	public Gato(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sonido() {
		System.out.println("Maullar");
	}

}
