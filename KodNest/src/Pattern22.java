public class Pattern22 {
    public static void main(String[] args) {
        int n = 6
        		
        		; // Number of rows

        // Upper half of the pattern
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

        // Lower half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
