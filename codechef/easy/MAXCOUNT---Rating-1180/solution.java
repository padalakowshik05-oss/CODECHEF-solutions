class Solution {
    public int[] mostFrequent(int N, int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : A) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int maxFreq = 0;
        int answer = Integer.MAX_VALUE;
        for (int x : map.keySet()) {
            int freq = map.get(x);

            if (freq > maxFreq || (freq == maxFreq && x < answer)) {
                maxFreq = freq;
                answer = x;
            }
        }

        return new int[]{answer, maxFreq};
    }
}