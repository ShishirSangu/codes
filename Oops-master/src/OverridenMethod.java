
public class OverridenMethod {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog();
//		D.sound();
		
//		Dog dog = new Dog();
		dog.sound();
		dog.eat();
	}

}

abstract class Animal{
	void sound() {
		
	}
	void eat() {
		System.out.println("Are you eating");
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("Barking");
//		System.out.println("eating");
	}
	void eat() {
		System.out.println("eating");
	}
	
}
