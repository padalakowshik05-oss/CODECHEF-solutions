class Solution {
    public boolean isProductEven(ArrayList<Integer> arr) {

        for (int i : arr) {

            if (i % 2 == 0) {
                return true;
            }
        }

        return false;
    }
}