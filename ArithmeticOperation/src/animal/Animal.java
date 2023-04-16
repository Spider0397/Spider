package animal;

public class Animal {

	String Name= "Tiger";// variable
	public void name(){// method
		
		System.out.println("King of Animals");
		
	}
	
	public static void main(String[] args){
	Animal animal= new Animal(); //object
	animal.name();
	
	System.out.println(animal.Name);//variable calling always in SYSO
		
	}
}
