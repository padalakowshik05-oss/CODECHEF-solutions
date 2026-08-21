class Solution {
    public void sumArray(int[] arr) {
        long sum = 0;

        // Find total sum
        for (int num : arr) {
            sum += num;
        }

        // Replace each element
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(sum - arr[i]);
        }
    }
}