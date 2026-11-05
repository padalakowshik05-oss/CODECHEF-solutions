class Solution {
    boolean isSquare(int points[][]) {
        long d[] = new long[6];
        int k = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                long dx = points[i][0] - points[j][0];
                long dy = points[i][1] - points[j][1];

                d[k++] = dx * dx + dy * dy;
            }
        }

        Arrays.sort(d);

        if (d[0] == 0) {
            return false;
        }

        for (int i = 1; i < 4; i++) {
            if (d[i] != d[0]) {
                return false;
            }
        }

        return d[4] == d[5] && d[4] == 2 * d[0];
    }
}