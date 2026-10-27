class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
                int n = arr.length;
                int[] freq = new int[n + 1];

                for (int i = 0; i < n; i++) {
                    freq[arr[i]]++;
                    if (freq[arr[i]] == 2) {
                        result.add(arr[i]);
                    }
                }

                return result;
        
        
    }
}