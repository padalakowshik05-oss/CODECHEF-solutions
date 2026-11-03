class Solution {
    static boolean armstrongNumber(int n) {
        int temp=n;
        int sum=0;
        for(int i=0;i<3;i++){
            int d=n%10;
            sum+=Math.pow(d,3);
            n=n/10;
        }
        return sum==temp;


    }
}