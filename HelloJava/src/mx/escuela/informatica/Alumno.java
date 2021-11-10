package mx.escuela.informatica;

public class Alumno extends Persona implements ICalificacion {

	private double calificacion;
	

	public Alumno(int id, String nombre, String apellido, String correoElectronico, double calificacion) {
		super(id, nombre, apellido, correoElectronico);
		this.calificacion = calificacion;
	}
	
	public Alumno() {
		
	}


	@Override
	public void mostrarCalificaciones() {
		System.out.println("Calificacion: " + this.getCalificacion());
	}

	public void guardarCalificacion(double calificacion) {
		this.setCalificacion(calificacion);
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

}
