class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        ArrayList<Integer> result = new ArrayList<>();

        long value = 1;

        for (int i = 0; i < n; i++) {
            result.add((int) value);

            value = value * (n - 1 - i) / (i + 1);
        }

        return result;
        
    }
}