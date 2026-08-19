class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        int n=arr.size();
        for(int i=0;i<n;i++){
            if(arr.get(i)>=0){
                pos.add(arr.get(i));
            }
            else{
                neg.add(arr.get(i));
            }
        }
        arr.clear();
        int i = 0, j = 0;
        while (i < pos.size() && j < neg.size()) {
            arr.add(pos.get(i++));
            arr.add(neg.get(j++));
        }
        while (i < pos.size()) {
            arr.add(pos.get(i++));
        }
        while (j < neg.size()) {
            arr.add(neg.get(j++));
        }
    }
}