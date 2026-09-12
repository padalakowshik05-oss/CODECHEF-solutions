class Solution {
    public String extractMessage(String s) {
        return s.replace("LIE", " ").replaceAll(" +", " ").trim();
        
    }
}