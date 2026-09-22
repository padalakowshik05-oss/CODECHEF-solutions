class Solution {
    public int countTriplets(int[] arr, int target) {

        Arrays.sort(arr);

        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {

                    if (arr[left] == arr[right]) {
                        int n = right - left + 1;
                        count += n * (n - 1) / 2;
                        break;
                    }

                    int leftValue = arr[left];
                    int rightValue = arr[right];

                    int leftCount = 0;
                    int rightCount = 0;

                    while (left <= right && arr[left] == leftValue) {
                        left++;
                        leftCount++;
                    }

                    while (right >= left && arr[right] == rightValue) {
                        right--;
                        rightCount++;
                    }

                    count += leftCount * rightCount;

                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
}