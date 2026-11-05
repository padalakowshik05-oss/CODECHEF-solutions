class Solution {
    public int maxHeight(int n) {
        int height = 0;
        int blocks = 0;

        for (int i = 1; ; i++) {
            blocks += i;

            if (blocks > n) {
                break;
            }

            height++;
        }

        return height;
    }
}
