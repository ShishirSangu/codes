abstract class  Animall{
	abstract void eat();
	abstract void sound();
}
class Dog extends Animal {
	void eat() {
		System.out.println("eat");
	}
	void sound() {
		System.out.println("Barking");
	}
}

public class Inheritence {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Animall A = new Animall();
//		A.eat();
//		A.sound();
		
		Dog d = new Dog();
		d.eat();
		d.sound();
		
		
	}

}



