class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=arr.length;
        int[] freq=new int[n+1];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        for(int i=1;i<=n;i++){
            ans.add(freq[i]);
        }
        return ans;
        
    }
}
