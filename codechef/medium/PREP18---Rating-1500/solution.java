import java.util.*;

class Main {

    static long findMin(int[] a, int[] b, int[] c) {
        int i = 0;
        int j = 0;
        int k = 0;

        long ans = Long.MAX_VALUE;

        while (i < a.length && j < b.length && k < c.length) {

            int min = Math.min(a[i], Math.min(b[j], c[k]));
            int max = Math.max(a[i], Math.max(b[j], c[k]));

            ans = Math.min(ans, (long) max - min);

            if (a[i] == min) {
                i++;
            } 
            else if (b[j] == min) {
                j++;
            } 
            else {
                k++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int na = sc.nextInt();
            int nb = sc.nextInt();
            int nc = sc.nextInt();

            int[] a = new int[na];
            int[] b = new int[nb];
            int[] c = new int[nc];

            for (int i = 0; i < na; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < nb; i++) {
                b[i] = sc.nextInt();
            }

            for (int i = 0; i < nc; i++) {
                c[i] = sc.nextInt();
            }

            System.out.println(findMin(a, b, c));
        }
    }
}