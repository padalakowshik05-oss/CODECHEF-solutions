class Solution {
    public boolean isStrong(int n) {
        int sum=0;
        int temp=n;
        while(temp>0){
            int d=temp%10;
            sum+=fact(d);
            temp/=10;
        }
        return (sum==n);
        
        
    }
    static int fact(int m){
        int fact=1;
        for(int i=1;i<=m;i++){
            fact*=i;
        }
        return fact;
    }
}