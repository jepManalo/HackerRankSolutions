package Super;

public class Animal {
	
	int age;
	String name;
	
	//Constructor1
	public Animal() { 
		// nothing to do here at the moment
		// if you remove this constructor, there will be an error in Cat class
	}  
	
	//Constructor2
	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void makeNoise() {
		System.out.println("Hello, I am an animal!");
	}
	
	public void eat() {
		System.out.println("Munch munch");
	}
	
	private void doPrivate() {
		System.out.println("Do something private...");
	}

}
