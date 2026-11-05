class Solution {
    public List<Integer> findNumbers(int n, int d) {
        List<Integer> list = new ArrayList<>();

        if (d == 0) {
            list.add(0);
        }

        for (int i = 1; i <= n; i++) {
            int num = i;

            while (num > 0) {
                if (num % 10 == d) {
                    list.add(i);
                    break;
                }
                num /= 10;
            }
        }

        return list;
    }
}