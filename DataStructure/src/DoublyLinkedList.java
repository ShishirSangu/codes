import java.util.Scanner;

public class DoublyLinkedList {
	
	class Node {
		Node preLink;
		int data;
		Node nextLink;
	}
	
	private Node first;
	private Scanner scan = new Scanner(System.in);
	
	// Insertion at the front
	public void insertFront() {
		System.out.println("Enter an element: ");
		int ele = scan.nextInt();
		
		Node newnode = new Node();
		newnode.data = ele;
		newnode.preLink = null;
		newnode.nextLink = null;
		
		if (first == null) {
			first = newnode;
		} else {
			newnode.nextLink = first;
			first.preLink = newnode;
			first = newnode;
		}
	}
	
	// Insertion at the rear
	public void insertRear() {
		System.out.print("Enter an element: ");
		int ele = scan.nextInt();
		
		Node newnode = new Node();
		newnode.data = ele;
		newnode.preLink = null;
		newnode.nextLink = null;
		
		if (first == null) {
			first = newnode;
		} else {
			Node temp = first;
			while (temp.nextLink != null) {
				temp = temp.nextLink;
			}
			temp.nextLink = newnode;
			newnode.preLink = temp;
		}
	}
	
	// Delete from the front
	public void deleteFront() {
		if (first == null) {
			System.out.println("Deletion is not possible. The list is empty.");
		} else if (first.nextLink == null) {
			System.out.println("Deleted element: " + first.data);
			first = null;
		} else {
			System.out.println("Deleted element: " + first.data);
			first = first.nextLink;
			first.preLink = null; 
		}
	}
	
	// Delete from the rear
	public void deleteRear() {
		if (first == null) {
			System.out.println("Deletion is not possible. The list is empty.");
		} else if (first.nextLink == null) {
			System.out.println("Deleted element: " + first.data);
			first = null;
		} else {
			Node temp = first;
			while (temp.nextLink != null) {
				temp = temp.nextLink;
			}
			System.out.println("Deleted element: " + temp.data);
			temp.preLink.nextLink = null;
		}
	}
	
	// Display the list in forward order
	public void displayForward() {
		if (first == null) {
			System.out.println("The list is empty.");
		} else {
			Node temp = first;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.nextLink;
			}
			System.out.println();
		}
	}
	
	// Display the list in reverse order
	public void displayReverse() {
		if (first == null) {
			System.out.println("The list is empty.");
		} else {
			Node temp = first;
			while (temp.nextLink != null) {
				temp = temp.nextLink;
			}
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.preLink;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DoublyLinkedList dl = new DoublyLinkedList();
		
		while (true) {
			System.out.println("Press 1 -> Insert at the front");
			System.out.println("Press 2 -> Insert at the rear");
			System.out.println("Press 3 -> Delete from the front");
			System.out.println("Press 4 -> Delete from the rear");
			System.out.println("Press 5 -> Display in forward order");
			System.out.println("Press 6 -> Display in reverse order");
			System.out.println("Press any other key to stop");
			System.out.println("Enter your choice: ");
			int choice = scan.nextInt();
			
			switch (choice) {
				case 1:
					dl.insertFront();
					break;
				case 2:
					dl.insertRear();
					break;
				case 3:
					dl.deleteFront();
					break;
				case 4:
					dl.deleteRear();
					break;
				case 5:
					dl.displayForward();
					break;
				case 6:
					dl.displayReverse();
					break;
				default:
					System.exit(0);
 			}
		}
	}
}
