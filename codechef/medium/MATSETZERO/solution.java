public static void setZeroes(int[][] mat) {

    int n = mat.length;
    int m = mat[0].length;

    boolean[] row = new boolean[n];
    boolean[] col = new boolean[m];

    // Find zeros
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (mat[i][j] == 0) {
                row[i] = true;
                col[j] = true;
            }
        }
    }

    // Set zeroes
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (row[i] || col[j])
                mat[i][j] = 0;
        }
    }
}