class Solution {

    // function to count all pairs
    // from both the sorted arrays
    // whose sum is equal to a given
    // value
    static int countPairs(int a[], int b[], int x) {
        int count=0;
        int left=0;
        int right=b.length-1;
        while(left<a.length && right>=0){
            int sum=a[left]+b[right];
            if(sum==x){
                count++;
                left++;
                right--;
            }else if(sum<x){
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
}