class Solution {
    public boolean binarySearch(int[] arr, int k) {
        int n=arr.length;
        int l=0;
        int h=n-1;
        while(l<=h){
            int m=(l+h)/2;
            if(arr[m]==k){
                return true;
            }
            else if(arr[m]<k){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return false;
        
    }
}