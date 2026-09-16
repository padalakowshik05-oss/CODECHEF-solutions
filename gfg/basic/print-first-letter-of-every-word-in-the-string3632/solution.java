class Solution {
    String firstAlphabet(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i==0 || s.charAt(i-1)==' '){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
        
    }
};