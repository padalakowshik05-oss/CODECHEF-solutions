import java.util.*;

class Solution {
    public ArrayList<Integer> addFraction(int num1, int den1, int num2, int den2) {
        ArrayList<Integer> res = new ArrayList<>();

        int numerator = num1 * den2 + num2 * den1;
        int denominator = den1 * den2;

        int g = gcd(numerator, denominator);

        res.add(numerator / g);
        res.add(denominator / g);

        return res;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}