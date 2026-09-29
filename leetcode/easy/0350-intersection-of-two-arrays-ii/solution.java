class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n=nums1.length;
        int m=nums2.length;
        int[] a=new int[n];
        int k=0;
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(nums1[i]==nums2[j]){
                a[k]=nums1[i];
                k++;
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return Arrays.copyOf(a,k);
    }
}