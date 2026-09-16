class Solution {
    static int extractMaximum(String s) {
        int max=-1;
        int num=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
                if(num>max){
                    max=num;
                }
            }
            else{
                num=0;
            }
        }
        return max;
        
    }
}
