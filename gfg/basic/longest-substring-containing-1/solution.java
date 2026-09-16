class Solution {
    public int longestSubstring(String s) {
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='1'){
                count++;
                if(count>max){
                    max=count;
                }
            }else{
                count=0;
            }
            
        }
        return max;
        
    }
}