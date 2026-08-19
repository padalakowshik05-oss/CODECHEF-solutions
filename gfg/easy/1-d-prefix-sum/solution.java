class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(arr[0]);
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        for(int i=1;i<n;i++){
            ans.add(arr[i]);
        }
        return ans;
        
    }
}