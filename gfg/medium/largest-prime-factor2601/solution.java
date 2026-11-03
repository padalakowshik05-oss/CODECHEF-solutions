class Solution {
    static int largestPrimeFactor(int n) {
        int largest = -1;

               for (int i = 2; i <= n; i++) {
                   while (n % i == 0) {
                       largest = i;
                       n = n / i;
                   }
               }

               return largest;
        
    }
}