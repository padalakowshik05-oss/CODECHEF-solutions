class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            
            map.put(ch1,map.getOrDefault(ch1,0)+1);
            map.put(ch2,map.getOrDefault(ch2,0)-1);
        }
        for(int count:map.values()){
            if(count!=0){
                return false;
            }
        }
        return true;
        
    }
}