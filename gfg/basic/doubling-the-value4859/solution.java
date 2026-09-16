class Solution {
    public int solve(int b, List<Integer> arr) {
        int a=b;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==a){
                a=a*2;
            }
        }
        return a;
        
    }
}