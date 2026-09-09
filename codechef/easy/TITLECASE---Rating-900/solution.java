import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        while (T-- > 0) {
            String s = sc.nextLine();
            String[] words = s.split(" ");

            for (int i = 0; i < words.length; i++) {

                boolean upper = true;

                for (char c : words[i].toCharArray()) {
                    if (Character.isLowerCase(c)) {
                        upper = false;
                        break;
                    }
                }

                if (!upper) {
                    words[i] = Character.toUpperCase(words[i].charAt(0))
                            + words[i].substring(1).toLowerCase();
                }
            }

            System.out.println(String.join(" ", words));
        }
    }
}