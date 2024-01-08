
public class Constructors {
		int id;
		String name;
		static String college = "kit"; 
	Constructors(int i,String na) {
		id = i;
		name = na;
		System.out.println("Bike is moving");
		System.out.println(id+" "+name);
	}
	void displayInfo(){
		System.out.println(id+" "+name+" "+college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors b = new Constructors(42,"Shishir");
		b.displayInfo();
		
		Constructors b2 = new Constructors(13,"Darshan");
		b2.displayInfo();
	}

}
