class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        int i = 0;
               int j = arr2.length - 1;
               ArrayList<Integer> ans=new ArrayList<>();

               int diff = Integer.MAX_VALUE;

               while (i < arr1.length && j >= 0) {
                   int sum = arr1[i] + arr2[j];
                   int currDiff = Math.abs(sum - x);

                   if (currDiff < diff) {
                       diff = currDiff;
                       ans.clear();
                       ans.add(arr1[i]);
                       ans.add(arr2[j]);
                   }

                   if (sum < x) {
                       i++;
                   } else {
                       j--;
                   }
               }

               return ans;
        
    }
}