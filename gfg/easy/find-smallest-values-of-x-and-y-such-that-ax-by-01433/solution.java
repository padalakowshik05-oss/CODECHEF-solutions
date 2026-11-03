class Solution {
    ArrayList<Integer> findXY(int a, int b) {
         int g = gcd(a, b);

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(b / g);
        ans.add(a / g);

        return ans;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
        
    }
}