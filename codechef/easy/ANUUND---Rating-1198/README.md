# ANUUND - Rating 1198

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Ups and Downs
### Problem description

You will be given a zero-indexed array  **A**. You need to rearrange its elements in such a way that the following conditions are satisfied:

- A[i] ≤ A[i+1] if i is even.
- A[i] ≥ A[i+1] if i is odd.
In other words the following inequality should hold:  **A[0] ≤ A[1] ≥ A[2] ≤ A[3] ≥ A[4]**, and so on. Operations  **≤**  and  **≥**  should alter.
### Input

The first line contains a single integer  **T**  denoting the number of test cases. The first line of each test case contains an integer  **N**, that is the size of the array  **A**. The second line of each test case contains the elements of array  **A** 

### Output

For each test case, output a single line containing  **N**  space separated integers, which are the elements of  **A**  arranged in the required order. If there are more than one valid arrangements, you can output any of them.

### Constraints
- 1 ≤ N ≤ 100000
- Sum of N in one test file ≤ 600000
- 1 ≤ A[i] ≤ 10^9
### Sample 1:
Input
Output

```
2
2
3 2
3
10 5 2
```

```
2 3
2 10 5
```

### Explanation:

 **Example case 1.** 
 **A[0]**  ?  **A[1]**  is satisfied, 2 ? 3.

 **Example case 2.** 
 **A[0]**  ?  **A[1]**  is satisfied, 2 ? 10.
 **A[1]**  ?  **A[2]**  is satisfied, 10 ? 5.
 **Note:**  5 10 2 is also valid answer.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T10:04:17.872Z  

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            // Swap every pair
            for (int i = 1; i < n - 1; i += 2) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/ANUUND)