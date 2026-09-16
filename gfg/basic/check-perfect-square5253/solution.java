class Solution {
    public boolean isPerfectSquare(int n) {
        for(int i=1;i<=Math.sqrt(n);i++){
            if(i*i==n){
                return true;
            }
        }
        return false;
        
    }
}