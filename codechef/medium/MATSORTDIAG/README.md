# MATSORTDIAG

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sort Matrix Diagonally

Given a `N x M` matrix, sort its elements diagonally. For eg. see the following matrix and its diagonal sorting:

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the no. of rows and columns in the input matrix.
- Next $N$ lines contains $M$ space separated integers, the elements of the matrix.
### Output Format
- Output $N$ lines, each containing $M$ space separated integers, the elements of diagonally sorted matrix.
### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are non-negative and won't exceed $1000$.
### Sample 1:
Input
Output

```
3 3
3 1 5
8 2 1
4 6 0
```

```
0 1 5
6 2 1
4 8 3
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T14:36:16.854Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/MATSORTDIAG)