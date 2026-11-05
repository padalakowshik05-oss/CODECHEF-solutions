class Solution {
    public int findOR(int[] arr, int x) {
        int result = 0;

        for (int num : arr) {
            if (num % x == 0) {
                result |= num;
            }
        }

        return result;
    }
}