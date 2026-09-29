class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[] positions = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                positions[count] = i;
                count++;
            }
        }

        int[] a = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int q = queries[i];

            if (q <= count) {
                a[i] = positions[q - 1];
            } else {
                a[i] = -1;
            }
        }

        return a;
    }
}