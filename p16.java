
// a 
// b b 
// c c c

public class p16 {
    public static void main(String[] args) {
        int s = 97;
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print((char) (s + i - 1) + " ");
            }
            System.out.println();
        }
    }
}
