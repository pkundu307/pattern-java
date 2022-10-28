//a b c  
//b c d
//c d e

// 123
// 234
// 345

public class p15 {
    public static void main(String[] args) {
        char s = 97;
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.print((char) (s + i + j - 2) + " ");
            }

            System.out.println();

        }
    }
}
