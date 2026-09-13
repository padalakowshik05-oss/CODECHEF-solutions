class Solution {
    public ArrayList<Integer> printPalindromes(int m, int n) {
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=m;i<=n;i++){
            if(isPalindrome(i)){
                arr1.add(i);
            }
        }
        return arr1;
        
    }
    static boolean isPalindrome(int i){
        int rev=0;
        int temp=i;
        while(temp>0){
            int d=temp%10;
            rev=rev*10+d;
            temp/=10;
        }
        
        return rev==i;
    }
}