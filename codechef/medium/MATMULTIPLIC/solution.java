import java.util.*;

class Codechef {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] a = new int[m][n];

        // Matrix A
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int n2 = sc.nextInt();
        int p = sc.nextInt();

        int[][] b = new int[n2][p];

        // Matrix B
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < p; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {

                int sum = 0;

                for (int k = 0; k < n; k++) {
                    sum += a[i][k] * b[k][j];
                }

                System.out.print(sum + " ");
            }

            System.out.println();
        }
    }
}