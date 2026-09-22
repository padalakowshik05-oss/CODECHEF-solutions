class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        for(int i=0;i<arr.length-2;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                int third=target-arr[i]-arr[j];
                if(set.contains(third)){
                    return true;
                }
                set.add(arr[j]);
            }
                
        }
        return false;
        
    }
}
