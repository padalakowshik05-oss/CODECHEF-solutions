class Solution {
    String removeCharacters(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                ans.append(c);
            }
        }
        return ans.toString();
        
    }
}