class Solution {
    public ArrayList<Integer> findUnion(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                ans.add(a[i]);
                i++;
            }
            else if(a[i]>b[j]){
                ans.add(b[j]);
                j++;
            }
            else{
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        while(i<a.length){
            ans.add(a[i]);
            i++;
        }
        while(j<b.length){
            ans.add(b[j]);
            j++;
        }
        return ans;
        
    }
};