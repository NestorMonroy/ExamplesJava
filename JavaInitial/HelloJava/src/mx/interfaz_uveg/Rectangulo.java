package mx.interfaz_uveg;

public class Rectangulo implements IFigura{
	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public void dibujar() {
		System.out.println("Impresion del rectangulo");		
	}

	@Override
	public double calcularArea() {
		return  this.base * this.altura;
	}

	@Override
	public void imprimirArea() {
		System.out.println("EL area del rectangulo es: "+ this.calcularArea());
	}

}
