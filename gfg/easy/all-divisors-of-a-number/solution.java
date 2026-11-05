class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
               ArrayList<Integer> second = new ArrayList<>();

               for (int i = 1; i <= n / i; i++) {
                   if (n % i == 0) {
                       list.add(i);

                       if (i != n / i) {
                           second.add(n / i);
                       }
                   }
               }

               for (int i = second.size() - 1; i >= 0; i--) {
                   list.add(second.get(i));
               }

               return list;
        
    }
}