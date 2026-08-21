import java.util.*;

class Solution {
    public ArrayList<Integer> findEvenOccurrences(int[] arr) {
        int[] freq = new int[100001];
        for (int num : arr) {
            freq[num]++;
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (freq[num] % 2 == 0 && !result.contains(num)) {
                result.add(num);
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }
}