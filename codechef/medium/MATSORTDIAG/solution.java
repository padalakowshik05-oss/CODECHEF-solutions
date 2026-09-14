import java.util.*;

class Codechef {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();

        for (int s = 0; s < n + m - 1; s++) {

            ArrayList<Integer> list = new ArrayList<>();

            int i = s < m ? 0 : s - m + 1;
            int j = s < m ? s : 0;

            for (int x = i, y = j; x < n && y < m; x++, y++)
                list.add(a[x][y]);

            Collections.sort(list);

            int k = 0;

            for (int x = i, y = j; x < n && y < m; x++, y++)
                a[x][y] = list.get(k++);
        }

        for (int[] row : a) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}