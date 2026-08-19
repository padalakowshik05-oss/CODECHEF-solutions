class Solution {
    int unvisitedLeaves(int arr[], int k) {
        boolean[] visited = new boolean[k + 1];

        for (int x : arr) {
            if (x > k) {
                continue;
            }

            for (int j = x; j <= k; j += x) {
                visited[j] = true;
            }
        }

        int count = 0;

        for (int i = 1; i <= k; i++) {
            if (!visited[i]) {
                count++;
            }
        }

        return count;
    }
}