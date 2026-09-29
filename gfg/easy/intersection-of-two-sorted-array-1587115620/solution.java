class Solution {
    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr1.length;
        int m = arr2.length;

        int i = 0;
        int j = 0;

        while (i < n && j < m) {

            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }

            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if (arr1[i] == arr2[j]) {
                ans.add(arr1[i]);
                i++;
                j++;
            }
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        return ans;
    }
}