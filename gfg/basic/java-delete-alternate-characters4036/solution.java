class Solution {
    static String delAlternate(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i+=2){
            ans.append(s.charAt(i));
        }
        return ans.toString();
        
    }
}