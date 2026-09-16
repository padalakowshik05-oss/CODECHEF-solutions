class Solution {
    public boolean divisibleBy5(String n) {
        char last = n.charAt(n.length() - 1);

                return last == '0' || last == '5';
        
    }
};