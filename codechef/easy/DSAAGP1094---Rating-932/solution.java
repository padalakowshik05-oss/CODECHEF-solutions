public static int searchInsertPosition(int[] arr, int n, int k) {
    int l=0;
    int r=n-1;
    while(l<=r){
        int m=(l+r)/2;
        if(arr[m]==k){
            return m;
        }
        else if(arr[m]<k){
            l=m+1;
        }
        else{
            r=m-1;
        }
        
    }
    return l;
}
