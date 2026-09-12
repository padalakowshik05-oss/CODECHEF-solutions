class Solution {
    public int countVowels(String s) {
        HashSet<Character> set = new HashSet<>();

               for (char c : s.toCharArray()) {
                   if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                       set.add(c);
                   }
               }

               return set.size();
        
    }
}