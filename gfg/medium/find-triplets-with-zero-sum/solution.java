class Solution {
    public boolean findTriplets(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = i + 1; j < arr.length; j++) {

                int sum = arr[i] + arr[j];

                if (set.contains(-sum)) {
                    return true;
                }

                set.add(arr[j]);
            }
        }

        return false;
    }
}