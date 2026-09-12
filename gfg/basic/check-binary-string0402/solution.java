class Solution {
    public boolean checkBinary(String s) {

                boolean seenOne = false;
                       boolean seenZeroAfterOne = false;

                       for (int i = 0; i < s.length(); i++) {
                           char c = s.charAt(i);

                           if (c == '1') {
                               if (seenZeroAfterOne) {
                                   return false;
                               }
                               seenOne = true;
                           } 
                           else {
                               if (seenOne) {
                                   seenZeroAfterOne = true;
                               }
                           }
                       }

                       return true;
        
    }
}