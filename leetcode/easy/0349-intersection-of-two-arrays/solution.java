class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
       int[] a=new int[n];
       int i=0;
       int j=0;
       int k=0;
       while(i<n && j<m){
        if(i>0 && nums1[i]==nums1[i-1]){
            i++;
            continue;
        }
        if(j>0 && nums2[j]==nums2[j-1]){
            j++;
            continue;
        }
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
       return Arrays.copyOf(a, k);
    }
}