class Solution {
    public ArrayList<Integer> getTriangle(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        solve(arr, ans);
        return ans;
    }

    void solve(int[] arr, ArrayList<Integer> ans) {
        int n = arr.length;
        if (n == 1) {
            ans.add(arr[0]);
            return;
        }
        int[] next = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            next[i] = arr[i] + arr[i + 1];
        }
        solve(next, ans);
        for (int x : arr) {
            ans.add(x);
        }
    }
}