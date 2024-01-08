import java.util.Scanner;
public class Stack {
	
	private int stack[];
	private int size;
	private int top=-1;
	
	private Scanner scan = new Scanner(System.in);
	
	public Stack(int n) {
		stack = new int[n];
		size = stack.length;
	}
	 
	public void insert() {
		if(top == size-1) {
			System.out.println("Insertion not possible");
		}else {
			System.out.print("Enter the element : ");
			int ele = scan.nextInt();
			++top;
			stack[top] = ele;
		}
	}
	
	public void delete() {
		if(top == -1) {
			System.out.println("Delrtion is not possible");
		}else {
			System.out.println("Delete " + stack[top]);
			--top;
		}
	}
	
	public void display() {
		if(top == -1) {
			System.out.println("Display not possible");
		}else {
			for(int i=top;i>=0;i--) {
			System.out.println(" "+stack[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int n = scan.nextInt();

        Stack S = new Stack(n);

        while (true) {
            System.out.println("Press 1 -> Insert");
            System.out.println("Press 2 -> Delete");
            System.out.println("Press 3 -> Display");
            System.out.println("Press any other key to stop");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    S.insert();
                    break;
                case 2:
                    S.delete();
                    break;
                case 3:
                    S.display();
                    break;
                default:
                    System.exit(0);
            }
        }

	}

}
