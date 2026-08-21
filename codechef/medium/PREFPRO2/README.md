# PREFPRO2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Optimization Using Prefix Array

Given an array of length $n$, we need to perform $m$ query over the array.

In each query you need to find the sum of the element in the range $a$ to $b$.

### Without using prefix sum
- For each query we need to iterate over the length of array, which will take $O(n)$ time.
- Total m query will make the time complexity $O(n*m)$
### Using prefix sum
- Create an prefix sum array in $O(n)$ time.
- For each query we can find the sum of a range in $O(1)$ time, using $prefix[b] - prefix[a-1]$ as the sum of range from $a$ to $b$
- Total $m$ query will make the time complexity $m * O(1) + O(n)$ => $O(m) + O(n)$

We can see above clearly how prefix sum help us to optimize the time complexity of our code.

### Task

Use the optimized algorithm to solve the problem.

### Input Format
- First line contains an integer $N$, the length of the array.
- Second line contains $N$ elements a1, a2, a3.... ar$N$.
- Third line gives an integer $K$, the number of queries.
- Next $K$ line contains queries with integer a$i$ and b$i$.
### Constraints
- $1 \leq N \leq 100000$
- $1 \leq arr_i \leq 100000$
- $1 \leq K \leq 100000$
- $1 \leq a_i, b_i \leq N$
### Sample 1:
Input
Output

```
5
1 2 3 4 5 
5
1 2
2 3
2 4
4 4
1 5
```

```
3
5
9
4
15

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T09:59:14.440Z  

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] prefix = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            prefix[i] = prefix[i - 1] + num;
        }

        int k = sc.nextInt();

        while (k-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            long sum = prefix[b] - prefix[a - 1];

            System.out.println(sum);
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PREFPRO2)