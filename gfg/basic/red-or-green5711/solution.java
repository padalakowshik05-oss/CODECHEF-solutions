class Solution {
    public int redOrGreen(String s) {
        int r=0;
        int g=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='R'){
                r++;
            }
            else{
               g++; 
            }
        }
        if(r<g){
            return r;
        }
        else{
            return g;
        }
        
    }
}