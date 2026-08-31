class Solution {
    int isPerfect(int N) {
        int sum=0;
        int temp=N;
        while(temp>0){
            int d=temp%10;
            sum+=fact(d);
            temp/=10;
        }
        if(sum==N){
            return 1;
        }
        else{
            return 0;
        }
        
    }
    static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}