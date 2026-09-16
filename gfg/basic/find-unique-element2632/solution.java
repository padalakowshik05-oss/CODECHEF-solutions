class Solution {
    public int uniqueElement(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                return arr[i];
            }
        }
        return -1;
        
    }
}