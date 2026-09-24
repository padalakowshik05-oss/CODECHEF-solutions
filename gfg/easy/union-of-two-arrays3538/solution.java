class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> res=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            while(i>0 && i<a.length && a[i-1]==a[i]){
                i++;
            }
            while(j>0 && j<b.length && b[j-1]==b[j]){
                j++;
            }
            if (i == a.length || j == b.length) {
                            break;
            }
            if(a[i]<b[j]){
                res.add(a[i]);
                i++;
            }
            else if(a[i]>b[j]){
                res.add(b[j]);
                j++;
            }
            else{
                res.add(a[i]);
                i++;
                j++;
            }
        }
        while(i<a.length){
            if(i==0 || a[i-1]!=a[i]){
                res.add(a[i]);
            }
            i++;
        }
        while(j<b.length){
            if(j==0 || b[j-1]!=b[j]){
                res.add(b[j]);
            }
            j++;
        }
        return res;
        
    }
}