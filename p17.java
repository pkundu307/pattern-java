// A 
// B C
// D E F

public class p17 {
    public static void main(String[] args) {
        int s = 65;

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print((char) s++ + " ");
            }
            System.out.println();
        }
    }
}
