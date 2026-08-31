class Solution {
    static int cubeRoot(int n) {
        int ans = 0;

        for (int i = 1; i * i * i <= n; i++) {
            ans = i;
        }

        return ans;
        
    }
};