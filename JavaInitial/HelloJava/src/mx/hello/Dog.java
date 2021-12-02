package mx.hello;

public class Dog extends Animal{

	public Dog(String type, String kind) {
		//La palabra reservada super no permite valores a los parametros
		//definidos en el constructor de una clase que es extendida *ClaseBase
		super(type, kind);
		
	}
	
	public String bark(){
		return "EL perro esta ladrando";
	}
	
}
