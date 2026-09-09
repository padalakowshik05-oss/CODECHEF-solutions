import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = sc.nextInt();

        while (n-- > 0) {
            String word = sc.next();
            boolean canRead = true;

            for (char c : word.toCharArray()) {
                if (s.indexOf(c) == -1) {
                    canRead = false;
                    break;
                }
            }

            if (canRead)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}