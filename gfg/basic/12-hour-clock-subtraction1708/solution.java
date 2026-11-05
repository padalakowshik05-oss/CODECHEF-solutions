class Solution {
    public int subClock(int x, int y) {
        return (x - y + 1200) % 12;
    }
}