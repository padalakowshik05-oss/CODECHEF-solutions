class Solution {
    public String removeChars(String s1, String s2) {
        HashSet<Character> set=new HashSet<>();
        StringBuilder ans=new StringBuilder();
        for(char c:s2.toCharArray()){
            set.add(c);
        }
        for(char c:s1.toCharArray()){
            if(set.contains(c)){
                continue;
            }
            else{
                ans.append(c);
            }
        }
        return ans.toString();
        
    }
}