class Solution {
    public boolean ternarySearch(int[] arr, int x) {
        int n=arr.length;
        int l=0;
        int h=n-1;
        while(l<=h){
            int m1=l+(h-l)/3;
            int m2=h-(h-l)/3;
            if(arr[m1]==x || arr[m2]==x){
                return true;
            }
            else if(x<arr[m1]){
                h=m1-1;
            }
            else if(x>arr[m2]){
                l=m2+1;
            }
            else{
                h=m2-1;
                l=m1+1;
            }
        }
        return false;
        
    }
}