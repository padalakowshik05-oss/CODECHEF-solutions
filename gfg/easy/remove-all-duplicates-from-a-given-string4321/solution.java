class Solution {
    String removeDuplicates(String s) {
        HashSet<Character> set=new HashSet<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(set.contains(c)){
                continue;
            }
            else{
                ans.append(c);
                set.add(c);
            }
        }
        return new String(ans);
    }
}
