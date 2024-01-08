import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l = new ArrayList<String>();
		l.add("Mango");
		l.add("Apple");
		l.add("Banana");
		l.add("Grepes");
		
//		String a[] = {"Thothaputi", "KashimirApple", "Yelakki", "Black"};
		
//		System.out.println(l);
		System.out.println("The fruit is : "+l.get(1));
		l.set(1,"Pinapple");
		for(int i=0;i<l.size();i++) {
			String f = l.get(i);
			System.out.println(f);
		}
		System.out.println();
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(15);
		li.add(14);
		li.add(40);
		
		for(int i=0;i<li.size();i++) {
			int n = li.get(i);
			System.out.println(n);
		}
		li.add(2, 9);
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		
		System.out.println();
		
		
		int newA[] = {1, 5, 2, 4, 6, 7, 4, 0};
		
		List<Integer> la = new ArrayList<Integer>();
		
		for(int i=0;i<newA.length;i++) {
			li.add(newA[i]);
			
		}
		System.out.println(la);
		
		
		
	}
}
