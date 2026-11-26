class Solution {
    public int[] singleNum(int[] arr) {
        int xor = 0;

        // XOR of all elements
        for (int num : arr) {
            xor ^= num;
        }

        // Find the rightmost set bit
        int bit = xor & (-xor);

        int a = 0;
        int b = 0;

        // Divide elements into two groups
        for (int num : arr) {
            if ((num & bit) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }

        // Return in increasing order
        if (a < b) {
            return new int[]{a, b};
        }

        return new int[]{b, a};
    }
}