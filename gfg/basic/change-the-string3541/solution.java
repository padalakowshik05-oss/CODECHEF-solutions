class Solution {
    String modify(String s) {
        StringBuilder ans=new StringBuilder();
        char first=s.charAt(0);
        ans.append(s.charAt(0));
        
        for(int i=1;i<s.length();i++){
            if(Character.isUpperCase(first)){
                ans.append(Character.toUpperCase(s.charAt(i)));
            }else{
                ans.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return ans.toString();
    }
}