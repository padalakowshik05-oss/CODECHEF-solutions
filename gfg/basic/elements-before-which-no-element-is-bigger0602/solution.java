class Solution {
    public int countElements(int[] arr) {
        int n=arr.length;
        int cnt=1;
        int max=arr[0];
        
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                cnt++;
            }
        }
        return cnt;
        
    }
}
