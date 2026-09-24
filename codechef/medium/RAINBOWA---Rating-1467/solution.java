import java.util.*;

class Codechef {

    static String isRainbow(int a[], int n) {
        int i = 0;
        int j = n - 1;
        int prev = 0;

        while (i <= j) {

            if (a[i] != a[j]) {
                return "no";
            }

            if (a[i] < 1 || a[i] > 7) {
                return "no";
            }

            if (a[i] < prev) {
                return "no";
            }

            if (a[i] > prev + 1) {
                return "no";
            }

            prev = a[i];

            i++;
            j--;
        }

        if (prev != 7) {
            return "no";
        }

        return "yes";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println(isRainbow(a, n));
        }
    }
}