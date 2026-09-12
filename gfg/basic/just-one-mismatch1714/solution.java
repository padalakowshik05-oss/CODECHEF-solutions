class Solution {
    public boolean isStringExist(String s, String[] arr) {
        for (String word : arr) {

                   if (word.length() != s.length()) {
                       continue;
                   }

                   int count = 0;

                   for (int i = 0; i < s.length(); i++) {
                       if (s.charAt(i) != word.charAt(i)) {
                           count++;
                       }

                       if (count > 1) {
                           break;
                       }
                   }

                   if (count == 1) {
                       return true;
                   }
               }

               return false;
        
    }
}