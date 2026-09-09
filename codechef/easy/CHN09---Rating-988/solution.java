import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.next();

            int a = 0;
            int b = 0;

            for (char c : s.toCharArray()) {
                if (c == 'a')
                    a++;
                else
                    b++;
            }

            System.out.println(Math.min(a, b));
        }
    }
}