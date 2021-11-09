package mx.ejemplo_abstracto;

public class Perro extends Animal{

	public Perro(String nombre) {
		super(nombre);
	}

	@Override
	public void sonido() {
		System.out.println("Ladrar");
	}

}
