class Solution {
    public boolean isTrimorphic(int n) {
        long cube = (long) n * n * n;
        return String.valueOf(cube).endsWith(String.valueOf(n));
    }
}