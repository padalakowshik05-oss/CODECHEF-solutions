class Solution {
    public int countDivisibles(int a, int b, int m) {
        return b / m - (a - 1) / m;
    }
}