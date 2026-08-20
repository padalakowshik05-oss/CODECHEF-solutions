class Solution {
    public boolean isPerfect(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }
        while (i + 1 < n && arr[i] == arr[i + 1]) {
            i++;
        }
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }
        return i == n - 1;
        
    }
}
