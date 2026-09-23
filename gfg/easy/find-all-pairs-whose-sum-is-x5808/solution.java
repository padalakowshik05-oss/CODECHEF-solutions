class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<pair> list = new ArrayList<>();

        int left = 0;
        int right = arr2.length - 1;

        while (left < arr1.length && right >= 0) {

            int sum = arr1[left] + arr2[right];

            if (sum == target) {

                int x = arr1[left];
                int y = arr2[right];

                int count1 = 0;
                while (left < arr1.length && arr1[left] == x) {
                    count1++;
                    left++;
                }

                int count2 = 0;
                while (right >= 0 && arr2[right] == y) {
                    count2++;
                    right--;
                }

                // Add all combinations
                for (int i = 0; i < count1 * count2; i++) {
                    list.add(new pair(x, y));
                }

            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return list.toArray(new pair[0]);
    }
}