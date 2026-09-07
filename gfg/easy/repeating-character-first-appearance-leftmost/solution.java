class Solution {
    static int repeatedCharacter(String S) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: S.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<S.length();i++){
            if(map.get(S.charAt(i))>1){
                return i;
            }
        }
        return -1;
    }
}