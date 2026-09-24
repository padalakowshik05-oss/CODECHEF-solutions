class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        ArrayList<Integer> ans=new ArrayList<>();
        int[] a=new int[2];
        int diff=Integer.MAX_VALUE;
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int sum=arr[l]+arr[r];
            int diff1=Math.abs(target-sum);
            if(diff1<diff){
                diff=diff1;
                ans.clear();
                ans.add(arr[l]);
                ans.add(arr[r]);
            }
            if(sum<target){
                l++;
            }else{
                r--;
            }
        }
        
        return ans;
        
        
    }
}