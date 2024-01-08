import java.util.Scanner;

public class OueueDS {

    private int q[];
    private int size;
    private int r = -1;
    private int f = 0;

    private Scanner scan = new Scanner(System.in);

    public OueueDS(int n) {
        q = new int[n];
        size = q.length;
    }

    public void insert() {
        int ele;
        if (r == size - 1) {
            System.out.println("Insertion not possible");
        } else {
            System.out.println("Enter the element: ");
            ele = scan.nextInt();
            ++r;
            q[r] = ele;
        }
    }

    public void delete() {
        if (r == -1 || f > r) {
            System.out.println("Deletion not possible");
        } else {
            System.out.println("Deleted element is: " + q[f]);
            ++f;
        }
    }

    public void display() {
        if (r == -1 || f > r) {
            System.out.println("Display not possible");
        } else {
            for (int i = f; i <= r; i++) {
                System.out.print(q[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int n = scan.nextInt();

        OueueDS q = new OueueDS(n);

        while (true) {
            System.out.println("Press 1 -> Insert");
            System.out.println("Press 2 -> Delete");
            System.out.println("Press 3 -> Display");
            System.out.println("Press any other key to stop");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    q.insert();
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.display();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
