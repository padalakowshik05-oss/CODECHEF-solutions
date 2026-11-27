class Solution {
    public int countDistinct(int arr[]) {
        HashSet<Integer> set=new HashSet<>();
        int cnt=0;
        for(int i: arr){
            if(!set.contains(i)){
                set.add(i);
                cnt++;
            }
        }
        return cnt;
        
    }
}