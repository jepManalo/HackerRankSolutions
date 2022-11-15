package Super;

public class Cat extends Animal {
	
	String catFoodPreference;
	
	public Cat(int age, String name, String catFoodPreference){
		
		/* using "super()" to use constructor from parent */
		/* must always be the first line */
		super(age, name);
		this.catFoodPreference = catFoodPreference;
	}
	
	@Override
	public void makeNoise() {
		
		/* using "super" to use method from parent that was overriden */
		super.makeNoise(); 
		System.out.println("Meow meow meow!");
		
		eat();
		super.name = "Hello";
		super.name = "Hi";
	}
	
	public void jump() {
		super.makeNoise();
		
		/* error since doPrivate has access mod "private" in parent class */
		/* to mitigate this, make doPrivate access mod "protected" in parent class */
		//super.doPrivate(); 
	}

}
