class Solution {
    String remConsonants(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!isVowel(c)){
                continue;
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
        
    }
    static boolean isVowel(char c){
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U');
    }
};