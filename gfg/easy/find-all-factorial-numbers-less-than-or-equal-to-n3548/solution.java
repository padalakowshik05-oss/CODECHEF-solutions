class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> list = new ArrayList<>();

        long fact = 1;

        for (long i = 1; ; i++) {
            fact *= i;

            if (fact > n) {
                break;
            }

            list.add(fact);
        }

        return list;
    }
}