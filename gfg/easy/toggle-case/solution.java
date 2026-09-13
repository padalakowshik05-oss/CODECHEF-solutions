class Solution {
    public String toggleCase(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                ans.append(Character.toUpperCase(s.charAt(i)));
            }
            else{
                ans.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return ans.toString();
    }
}
