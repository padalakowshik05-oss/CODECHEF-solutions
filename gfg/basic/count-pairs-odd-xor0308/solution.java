class Solution {
    public int countXorPair(int[] arr) {
        int even = 0;
        int odd = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return even * odd;
    }
}