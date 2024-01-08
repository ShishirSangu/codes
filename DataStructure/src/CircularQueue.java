import java.util.Scanner;

public class CircularQueue {
	
	private int Cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;
	
	private Scanner scan =  new Scanner(System.in);
	
	public CircularQueue(int n) {
		Cq = new int[n];
		size = Cq.length;
	}
	
	public void insert() {
		if(count == size) {
			System.out.println("Insertion not possible");
		}else {
			System.out.println("Enter the elemnet : ");
			int ele = scan.nextInt();
			r = (r+1) % size;
			Cq[r] = ele;
			count++;
		}
	}
	
	public void delete() {
		if(count == 0) {
			System.out.println("Deletion not possible");
		}else {
			System.out.println("delete no. "+Cq[f]);
			f = (f+1)%size;
			count--;
		}
	}
	
	public void display() {
		int f1 = f;
		if(count == 0) {
			System.out.println("Display not possible");
		}else {
			for(int i=1;i<=count;i++) {
			System.out.println("Display number are : "+Cq[f1]);
			f1 = (f1+1)%size;
//			f1++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of queue : ");
		int n = scan.nextInt();
		
		CircularQueue CQ = new CircularQueue(n);
		
		while (true) {
            System.out.println("Press 1 -> Insert");
            System.out.println("Press 2 -> Delete");
            System.out.println("Press 3 -> Display");
            System.out.println("Press any other key to stop");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    CQ.insert();
                    break;
                case 2:
                    CQ.delete();
                    break;
                case 3:
                    CQ.display();
                    break;
                default:
                    System.exit(0);
            }
        }

	}

}
