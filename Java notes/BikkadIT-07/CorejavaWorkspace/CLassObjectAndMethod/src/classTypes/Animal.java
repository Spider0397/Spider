package classTypes;

public class Animal {

	String name="Lion";
	
	public void eat() {
		System.out.println("Lion is eating");
	}
	
	public static void main(String[] args) {
		
		Animal animal=new Animal();
		System.out.println(animal.name);
		animal.eat();
	}
}
