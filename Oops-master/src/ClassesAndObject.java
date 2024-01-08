
public class ClassesAndObject {
	
	int id;
	String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassesAndObject Student1 = new ClassesAndObject();
//		new ClassesAndObject().id(42);
		Student1.id = 42;
		Student1.name = "Shishir";
		
		System.out.println(Student1.id);
		System.out.println(Student1.name);
		
		Student s = new Student();
		
		s.insertReccord(42, "ShishirSangu2");
		s.displayInfo();
		
		new Student().insertReccord(42, "ShishirSangu1");
	}

}
class Student{
	int id;
	String name;
	void insertReccord(int i,String n) {
		id = i;
		name = n; 
		System.out.println(id+" : "+name);
	}
	void displayInfo() {
		System.out.println(id+" : "+name);
	}
}
