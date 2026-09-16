class Solution {
    boolean canFormPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count = 0;

                for (int freq : map.values()) {
                    if (freq % 2 != 0) {
                        count++;
                    }
                }

                return count <= 1;
        
    }
}