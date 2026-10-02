import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += sc.nextLong();
        }

        long side = (long) Math.sqrt(sum);

        if (side * side == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}