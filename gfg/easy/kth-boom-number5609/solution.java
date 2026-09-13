class Solution {
    public String boomNumber(int k) {
        StringBuilder ans = new StringBuilder();

                k = k + 1;

                while (k > 1) {
                    if ((k & 1) == 0) {
                        ans.append('2');
                    } else {
                        ans.append('3');
                    }

                    k = k / 2;
                }

                return ans.reverse().toString();
        
    }
}