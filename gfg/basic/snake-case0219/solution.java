class Solution {
    public String snakeCase(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=Character.toLowerCase(s.charAt(i));
            if(c==' '){
                ans.append('_');
            }else{
              ans.append(c);  
            }
        }
        return new String(ans);
        
    }
}