class Solution {
    public boolean checkPermutation(int[] a, int[] b) {
        int n=a.length;
        int n1=b.length;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
        
    }
}