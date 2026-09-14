class Solution {
    public String smallestNumber(String s) {
        char[] a = s.toCharArray();
               int[] last = new int[10];

               for (int i = 0; i < a.length; i++)
                   last[a[i] - '0'] = i;

               for (int i = 0; i < a.length; i++) {

                   for (int d = 0; d < a[i] - '0'; d++) {

                       if (i == 0 && d == 0)
                           continue;

                       if (last[d] > i) {

                           int j = last[d];

                           char temp = a[i];
                           a[i] = a[j];
                           a[j] = temp;

                           return new String(a);
                       }
                   }
               }

               return s;
        
    }
}