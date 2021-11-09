package mx.hello;

public class InheritanceProject {

	public static void main(String[] args) {
		// Perro
		Dog dog = new Dog("perro", "mamifero");
		System.out.println(dog.eat());
		System.out.println(dog.sleep());
		System.out.println(dog.bark());
		
		System.out.println();
		//Gato
		Cat cat = new Cat("gato","mamifero");
		System.out.println(cat.eat());
		System.out.println(cat.sleep());
		System.out.println(cat.meow());
	}

}
