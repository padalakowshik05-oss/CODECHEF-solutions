class Solution {
    boolean distinctPF(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % (i * i) == 0) {
                return false;
            }
        }
        return true;
    }
}