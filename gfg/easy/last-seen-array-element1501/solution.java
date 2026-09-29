class Solution {
    public int earliestLastOcc(int arr[]) {
        int[] last = new int[1000001];

        for (int i = 0; i < arr.length; i++) {
            last[arr[i]] = i;
        }

        int minIndex = arr.length;
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (last[arr[i]] == i) {
                if (i < minIndex) {
                    minIndex = i;
                    ans = arr[i];
                }
            }
        }

        return ans;
    }
}