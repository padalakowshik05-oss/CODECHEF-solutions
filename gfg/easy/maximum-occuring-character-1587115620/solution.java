class Solution {
    public static char getMaxOccuringChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char ans = 'z';
        int max = 0;

        for (char ch : map.keySet()) {
            if (map.get(ch) > max || 
                (map.get(ch) == max && ch < ans)) {
                max = map.get(ch);
                ans = ch;
            }
        }

        return ans;
        
    }
}