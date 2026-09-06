class Solution {
    public String removeChars(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
        
    }
};