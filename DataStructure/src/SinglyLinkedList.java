import java.util.Scanner;

public class SinglyLinkedList {
	
	class Node
	{
		int data;
		Node link;
	}
	private Scanner scan = new Scanner(System.in);
	private Node first;
	
	
	public void insertRare() {
		Node temp;
		System.out.println("Enter the element to insert : ");
		int ele = scan.nextInt();
		Node newnode = new Node();
		newnode.data = ele;
		newnode.link = null;
		
		if(first == null) {
			first = newnode;
		}
		else {
			temp = first;
			while(temp.link!=null) {
				temp = temp.link ;
			}
			temp.link = newnode;
		}
	}
	
	public void deleteRare(){
		
		Node temp;
		if(first == null) {
			System.out.println("Deletion is not possible : ");
		}
		if(first.link == null) {
			System.out.println("Delete " + first.data);
			first = null;
		}
		else {
			temp = first;
			while(temp.link.link != null) {
				temp = temp.link;
			}
			System.out.println("Delete " + temp.link.data);
			temp.link = null;
		}
	}
	
	public void insertFront() {
		Node temp;
		System.out.println("Enter element : ");
		int ele = scan.nextInt();
		Node newnode = new Node();
		newnode.data = ele;
		newnode.link = null;
		
		if(first==null) {
			first = newnode;
		}
		else {
			newnode.link = first;
			first = newnode;
		}
	}
	
	
	public void deleteFront() {
		if(first == null) {
			System.out.println("Deletion not possible");
		}
		if(first == null) {
			System.out.println("Delete" + first.data);
			first = null;
		}
		else {
			System.out.println("Delete "+first.data);
			first = first.link;
		}
	}
	
	public void display() {
		Node temp;
		if(first==null) {
			System.out.println("Display Not possible");
		}
		else if(first.link == null) {
			System.out.println(first.data);
		}
		else {
			temp = first;
			while(temp != null) {
				System.out.print(temp.data+" ");
				temp = temp.link;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		SinglyLinkedList ll = new SinglyLinkedList();
		while(true) {
			System.out.println("Press 1 --------------->insertion rare : ");
			System.out.println("Press 2 --------------->dalete rare: ");
			System.out.println("Press 3 --------------->insertion front : ");
			System.out.println("Press 4 --------------->delete front : ");
			System.out.println("Press 5 --------------->display : ");
			System.out.println("are other key---------->stop ");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			switch(choice) {
			
			case 1 : ll.insertRare();
			break;
			case 2 : ll.deleteRare();
			break;
			case 3 : ll.insertFront();
			break;
			case 4 : ll.deleteFront();
			break;
			case 5 : ll.display();
			break;
			default : System.exit(0);
 			}
		}

	}

}
