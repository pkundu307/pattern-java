// a a a 
// b b b
// c c c
public class p12 {
    public static void main(String[] args) {
        char c = 97;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
            c++;
        }
    }
}
