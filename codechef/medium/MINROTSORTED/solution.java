class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int min=-1;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
        
    }
}
