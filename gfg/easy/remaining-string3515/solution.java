class Solution {
    public String printString(String s, char ch, int count) {
        StringBuilder ans=new StringBuilder();
        int count1=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
                if(count1>=count){
                    ans.append(c);
                }
                if(c==ch){
                    count1++;
                }
        }
        return ans.toString();
        
    }
}