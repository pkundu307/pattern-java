// 1 
// 2 1
// 3 2 1
// 4 3 2 1

public class p11 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            int k = i;

            for (int j = 1; j <= i; j++) {
                System.out.print(k-- + " ");

            }

            System.out.println();
        }
    }
}
