package mx.interfaz_uveg;

public class Circulo implements IFigura{
	private static final double PI= 3.1416;
	private double radio;
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public void dibujar() {
		System.out.println("Impresion del circulo");
	}

	@Override
	public double calcularArea() {
		return PI * Math.pow(this.radio, 2);
		
	}

	@Override
	public void imprimirArea() {
		System.out.println("EL area del circulo es: "+ this.calcularArea());
	}
	
	
}
