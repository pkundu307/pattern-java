// 1 2 3 4 5  
// 6 7 8 9 10 
// 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24 25

public class p9 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int count = 1;

        while (row <= n) {
            int col = 1;
            while (col <= n) {
                System.out.print(count + " ");
                count++;
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
