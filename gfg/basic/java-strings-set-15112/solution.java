class Solution {
    public String conRevstr(String S1, String S2) {

        StringBuilder ans = new StringBuilder();

        ans.append(S1);
        ans.append(S2);

        return ans.reverse().toString();
    }
}