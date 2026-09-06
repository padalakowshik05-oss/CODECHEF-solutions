import java.util.*;

class Codechef {

    static int digitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();

            int chefPoints = 0;
            int mortyPoints = 0;

            for (int i = 0; i < N; i++) {

                int A = sc.nextInt();
                int B = sc.nextInt();

                int chefPower = digitSum(A);
                int mortyPower = digitSum(B);

                if (chefPower > mortyPower) {
                    chefPoints++;
                } 
                else if (mortyPower > chefPower) {
                    mortyPoints++;
                } 
                else {
                    chefPoints++;
                    mortyPoints++;
                }
            }

            if (chefPoints > mortyPoints) {
                System.out.println("0 " + chefPoints);
            } 
            else if (mortyPoints > chefPoints) {
                System.out.println("1 " + mortyPoints);
            } 
            else {
                System.out.println("2 " + chefPoints);
            }
        }
    }
}