class Solution {
    public int countTriplets(int[] arr, int target) {

        Arrays.sort(arr);

        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                long sum = (long) arr[i] + arr[left] + arr[right];

                if (sum == target) {

                    if (arr[left] == arr[right]) {

                        int size = right - left + 1;
                        count += (size * (size - 1)) / 2;
                        break;

                    } else {

                        int leftValue = arr[left];
                        int rightValue = arr[right];

                        int leftCount = 0;
                        int rightCount = 0;

                        while (left <= right &&
                               arr[left] == leftValue) {
                            leftCount++;
                            left++;
                        }

                        while (right >= left &&
                               arr[right] == rightValue) {
                            rightCount++;
                            right--;
                        }

                        count += leftCount * rightCount;
                    }

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