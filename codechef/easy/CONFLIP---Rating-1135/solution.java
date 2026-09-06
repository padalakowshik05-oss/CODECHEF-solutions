import java.util.*;

class Codechef {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int G = sc.nextInt();

            while (G-- > 0) {

                int I = sc.nextInt();
                int N = sc.nextInt();
                int Q = sc.nextInt();

                int same = N / 2;
                int opposite = (N + 1) / 2;

                if (I == Q) {
                    System.out.println(same);
                } else {
                    System.out.println(opposite);
                }
            }
        }
    }
}