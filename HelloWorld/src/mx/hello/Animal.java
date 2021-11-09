package mx.hello;

public class Animal {
	private String type;
	private String kind;
	
	public Animal(String type, String kind) {
		super();
		this.type = type;
		this.kind = kind;
	}
	
	public String eat() {
		return "El " + this.type + " esta comiendo";
	}

	public String sleep() {
		return "El " + this.type + " esta comiendo";
	}

}
