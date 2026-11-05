class Solution {
    public int[] primePairs(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        prime[0] = false;
        if (n >= 1) prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                for (int j = 2; j <= n / i; j++) {
                    if (prime[j]) {
                        list.add(i);
                        list.add(j);
                    }
                }
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}