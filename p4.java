// * 
// * *
// * * *
// * * * *
// * * * * *
public class p4 {
    public static void main(String[] args) {
        int n = 5;
        int j;
        for (int i = 0; i < 5; i++) {
            for (j = 2 * (n - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) { // For Loop for col

                System.out.print("* "); // Print Star

            }

            System.out.println();

        }
    }
}
