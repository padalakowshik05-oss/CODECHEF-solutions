class Solution {
    public boolean isProduct(int[] arr, long target) {
        HashSet<Integer> set = new HashSet<>();

               for (int x : arr) {
                   if (x == 0 && target == 0) {
                       if (set.contains(0)) {
                           return true;
                       }
                   }
                   if (x != 0 && target % x == 0) {
                       long needed = target / x;

                       if (needed >= Integer.MIN_VALUE &&
                           needed <= Integer.MAX_VALUE &&
                           set.contains((int) needed)) {
                           return true;
                       }
                   }

                   set.add(x);
               }

               return false;
    }
}