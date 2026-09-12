class Solution {
    public boolean commonString(String[] s, String[] t) {
        HashSet<String> set = new HashSet<>();

               for (String word : s) {
                   set.add(word);
               }

               for (String word : t) {
                   if (set.contains(word)) {
                       return true;
                   }
               }

               return false;
        
    }
}