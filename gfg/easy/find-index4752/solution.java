class Solution {
    public ArrayList<Integer> findIndex(int[] arr, int key) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;

        int l = 0;
        int r = n - 1;

        while (l < n && arr[l] != key) {
            l++;
        }

        while (r >= 0 && arr[r] != key) {
            r--;
        }

        if (l < n && r >= 0) {
            ans.add(l);
            ans.add(r);
        } else {
            ans.add(-1);
            ans.add(-1);
        }

        return ans;
    }
}