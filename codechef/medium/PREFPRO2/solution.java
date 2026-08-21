import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] prefix = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            prefix[i] = prefix[i - 1] + num;
        }

        int k = sc.nextInt();

        while (k-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            long sum = prefix[b] - prefix[a - 1];

            System.out.println(sum);
        }

        sc.close();
    }
}