class Solution {
    public boolean halvesMatch(String s) {
        int n = s.length();
                int half = n / 2;

                HashMap<Character, Integer> map1 = new HashMap<>();
                HashMap<Character, Integer> map2 = new HashMap<>();

                for (int i = 0; i < half; i++) {
                    char c = s.charAt(i);
                    map1.put(c, map1.getOrDefault(c, 0) + 1);
                }

                for (int i = n - half; i < n; i++) {
                    char c = s.charAt(i);
                    map2.put(c, map2.getOrDefault(c, 0) + 1);
                }

                return map1.equals(map2);
        
    }
}