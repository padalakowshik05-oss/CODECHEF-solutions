class Solution {
    public boolean differOneBit(int a, int b) {
        return Integer.bitCount(a ^ b) == 1;
    }
}