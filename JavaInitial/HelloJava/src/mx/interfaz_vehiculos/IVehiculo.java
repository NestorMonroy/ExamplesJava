package mx.interfaz_vehiculos;

/*Para definir una interfaz, es necesaria la palabra clave interface*/
public interface IVehiculo {
	
	/*Las variables deben de ser constantes*/
	public final String marca = "UVEG";
	
	/*Todos los métodos son abstractos, por ende, no tienen cuerpo*/
	public void imprimirMotor();
	public void adeltante();
	public void reversa();
	public void montarRuedas(int ruedas);
	
}

