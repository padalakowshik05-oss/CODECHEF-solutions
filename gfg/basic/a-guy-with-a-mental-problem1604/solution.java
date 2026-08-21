class Solution {
    public int minTime(int[] a, int[] b) {
        int n=a.length;
        int tech1=0;
        int tech2=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                tech1+=a[i];
                tech2+=b[i];
            }
            else{
                tech1+=b[i];
                tech2+=a[i];
            }
        }
        return Math.min(tech1,tech2);
        
    }
}