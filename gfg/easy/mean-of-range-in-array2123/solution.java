import java.util.*;

class Solution {
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {

        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        long[] prefix = new long[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            long sum;

            if (l == 0) {
                sum = prefix[r];
            } else {
                sum = prefix[r] - prefix[l - 1];
            }

            int count = r - l + 1;

            int mean = (int)(sum / count);

            ans.add(mean);
        }

        return ans;
    }
}