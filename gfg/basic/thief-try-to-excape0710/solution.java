class Solution {
    public int totalJumps(int[] arr, int x, int y) {
        int jumps = 0;

        for (int height : arr) {
            if (height <= x) {
                jumps++;
            } else {
                int remaining = height - x;
                jumps += 1 + (remaining + (x - y) - 1) / (x - y);
            }
        }

        return jumps;
    }
}