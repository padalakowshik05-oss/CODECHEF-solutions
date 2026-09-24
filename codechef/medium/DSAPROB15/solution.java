import java.util.*;

public class Main {
    public static long countPairsLessThanX(int[] arr, int x) {
        long count = 0;
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] + arr[j] < x) {
                count += j - i;
                i++;
            } else {
                j--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        System.out.println(countPairsLessThanX(arr, x));
    }
}