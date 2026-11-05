# Prime Pairs with Limited Product

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Find all pairs (sets) of prime numbers **(p, q)**  such that  **p*q <= n**, where  **n**  is the given number.

 **Example 1:** 

```
Input: n = 4
Output: 2 2
Explanation: Pair (2, 2) which has both prime numbers as well as satisfying the condition 2*2 <= 4.

```

```
Input: n = 8
Output: 2 2 2 3 3 2
Explanation: Pairs(2, 2), (2, 3) and (3, 2) which has both prime numbers and satisfying the given condition. 
```

 **Constraints:** 
1 <= n <= 400

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T19:54:45.937Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pairs-of-prime-number2612/1)