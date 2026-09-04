import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int[] price = new int[26];

            for (int i = 0; i < 26; i++) {
                price[i] = sc.nextInt();
            }

            String s = sc.next();

            boolean[] present = new boolean[26];

            for (int i = 0; i < s.length(); i++) {
                int index = s.charAt(i) - 'a';
                present[index] = true;
            }

            int cost = 0;

            for (int i = 0; i < 26; i++) {
                if (!present[i]) {
                    cost += price[i];
                }
            }

            System.out.println(cost);
        }

        sc.close();
    }
}