import java.util.*;

class Codechef {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();

            int[] freq = new int[101];

            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                freq[x]++;
            }

            boolean possible = true;

            for (int i = 1; i <= 100; i++) {
                if (freq[i] % 2 != 0) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}