package mx.escuela.informatica;

public class Tutor extends Persona implements ICalificacion {

	private Alumno alumno;

	public Tutor(int id, String nombre, String apellido, String correoElectronico, Alumno alumno) {
		super(id, nombre, apellido, correoElectronico);
		this.alumno = alumno;
	}

	public Tutor() {

	}

	@Override
	public void mostrarCalificaciones() {
		System.out.println("Calificacion: " + this.alumno.getCalificacion());
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

}
