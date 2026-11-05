class Solution {
    public boolean canJump(int n) {
        return (n & (n - 1)) == 0;
    }
}
