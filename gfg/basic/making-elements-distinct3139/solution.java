class Solution {
    public int minSum(ArrayList<Integer> arr) {
        Collections.sort(arr);

        int sum = 0;
        int prev = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num <= prev) {
                num = prev + 1;
            }

            sum += num;
            prev = num;
        }

        return sum;
    }
}