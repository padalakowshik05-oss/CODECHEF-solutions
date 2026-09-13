class Solution {
    public String reducedString(String s) {
        StringBuilder stack = new StringBuilder();

               for (char ch : s.toCharArray()) {

                   stack.append(ch);

                   int n = stack.length();
                   if (n >= 3 &&
                       stack.charAt(n - 1) == stack.charAt(n - 2) &&
                       stack.charAt(n - 2) == stack.charAt(n - 3)) {

                       stack.delete(n - 3, n);
                   }
               }

               if (stack.length() == 0) {
                   return "-1";
               }

               return stack.toString();
        
    }
}