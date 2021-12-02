package mx.ejemplo_abstracto;

public abstract class Animal {
	private String nombre;

	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void imprimirNombre() {
		System.out.println("Mi nombre es: " + this.nombre);
	}
	
	public abstract void sonido();
	
}
