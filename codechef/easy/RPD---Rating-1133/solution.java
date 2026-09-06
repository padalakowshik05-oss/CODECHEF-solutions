import java.util.*;

class Codechef {

    // Function to calculate sum of digits
    static int digitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();

            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int maxSum = 0;

            // Try every pair
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {

                    int product = A[i] * A[j];

                    int sum = digitSum(product);

                    maxSum = Math.max(maxSum, sum);
                }
            }

            System.out.println(maxSum);
        }
    }
}