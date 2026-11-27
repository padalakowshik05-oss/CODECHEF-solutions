class Solution {
    public int missingNumber(int[] nums) {
        int xor=0;
        int xor1=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
            xor1^=i;
        }
        xor1^=nums.length;
        return xor^xor1;
    }
}