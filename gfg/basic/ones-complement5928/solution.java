class Solution {
    static int onesComplement(int n) {
        int mask = Integer.highestOneBit(n);
        mask = (mask << 1) - 1;

        return n ^ mask;
    }
}