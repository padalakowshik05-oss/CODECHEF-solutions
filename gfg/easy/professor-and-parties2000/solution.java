class Solution {
    public boolean isDistinct(int[] arr) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            if(set.contains(i)){
                return false;
            }
            set.add(i);
        }
        return true;
    }
}