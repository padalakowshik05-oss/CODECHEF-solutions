# Primes in a Range

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers **l**  and  **r**, find and return all prime numbers in the range  **[l, r]**  (inclusive).

 **Examples:** 

```
Input: l = 1, r = 10
Output: [2, 3, 5, 7]
Explanation:
The prime numbers between 1 and 10 are 2, 3, 5 and 7.
```

```
Input: l = 2, r = 5
Output: [2, 3, 5]
Explanation:
The prime numbers between 2 and 5 are 2, 3 and 5.
```

 **Constraints:** 
1≤ l ≤ r ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T05:16:07.709Z  

```java
class Solution {
    ArrayList<Integer> primeRange(int l, int r) {

        boolean[] prime = new boolean[r + 1];

        Arrays.fill(prime, true);

        if (r >= 0)
            prime[0] = false;
        if (r >= 1)
            prime[1] = false;

        for (int i = 2; i * i <= r; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= r; j += i) {
                    prime[j] = false;
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (prime[i])
                ans.add(i);
        }

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-prime-numbers-in-a-range4718/1)