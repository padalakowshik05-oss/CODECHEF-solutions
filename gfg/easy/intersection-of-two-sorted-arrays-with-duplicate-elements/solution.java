class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=a.length;
        int m=b.length;
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(j>0 && b[j]==b[j-1]){
                j++;
                continue;
            }
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return ans;
        
    }
}