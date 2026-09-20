class Solution {
    String merge(String s1, String s2) {
        StringBuilder ans=new StringBuilder();
        int i=0;
        int j=0;
        while(i<s1.length() && j<s2.length()){
            ans.append(s1.charAt(i));
            ans.append(s2.charAt(j));
            i++;
            j++;
        }
        while(i<s1.length()){
            ans.append(s1.charAt(i));
            i++;
        }
        while(j<s2.length()){
            ans.append(s2.charAt(j));
                j++;
            }
        
        return ans.toString();
        
    }
}