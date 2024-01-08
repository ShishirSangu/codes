import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CollectionInJava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(15);
		li.add(14);
		li.add(40);
		li.add(24);
		li.add(44);
		
		HashSet<Integer> h = new HashSet<Integer>(li);
		h.add(10);
		h.add(15);
		h.add(14);
		h.add(40);
		h.add(40);
		h.add(98);
		
		
		for(int i=0;i<li.size();i++) {
			int n = li.get(i);
			System.out.println(n);
		}
		
//		int a[] = {1, 5, 2, 4, 6, 7, 4, 0};
//		for(int i=0;i<a.length;i++) {
//			h.add(a[i]);
//		}
		
		System.out.println(h);
		
		
		
	}

}
