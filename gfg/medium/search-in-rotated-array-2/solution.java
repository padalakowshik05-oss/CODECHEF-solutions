class Solution {
    public boolean search(int[] arr, int key) {
        int n=arr.length;
        int l=0;
        int h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]==key){
                return true;
            }
            if (arr[l] == arr[m] && arr[m] == arr[h]) {
                            l++;
                            h--;
            }
            else if(arr[l]<=arr[m]){
                if(arr[l]<=key && key<arr[m]){
                    h=m-1;
                }
                else{
                    l=m+1;
                }
            }
            else{
                if(arr[m]<key && key<=arr[h]){
                    l=m+1;
                }
                else{
                    h=m-1;
                }
            }
        }
        return false;
        
    }
}
