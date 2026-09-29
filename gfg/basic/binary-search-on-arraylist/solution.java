class Solution {
    public static int binarySearchAL(ArrayList<Integer> list, int k) {
        int l = 0;
        int h = list.size() - 1;

        while (l <= h) {
            int m = l + (h - l) / 2;

            if (list.get(m) == k) {
                return m;
            }
            else if (list.get(m) > k) {
                h = m - 1;
            }
            else {
                l = m + 1;
            }
        }

        return -1;
    }
}