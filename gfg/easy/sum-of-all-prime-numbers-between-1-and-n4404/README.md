# Sum of Primes in Set from 1 to n

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive integer  **n**, compute and return the sum of all prime numbers between  **1**  and  **n**  (inclusive).

 **Examples:** 

```
Input: n = 5
Output: 10
Explanation: 2, 3 and 5 are prime numbers between 1 and 5(inclusive), and their sum is 2 + 3 + 5 = 10.

```

```
Input: n = 10
Output: 17
Explanation: 2, 3, 5 and 7 are prime numbers between 1 and 10(inclusive), and their sum is 2 + 3 + 5 + 7 = 17.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T05:18:30.636Z  

```java
class Solution {
    public int primeSum(int n) {
        boolean[] prime = new boolean[n + 1];

                for (int i = 2; i <= n; i++)
                    prime[i] = true;

                for (int i = 2; i * i <= n; i++) {
                    if (prime[i]) {
                        for (int j = i * i; j <= n; j += i) {
                            prime[j] = false;
                        }
                    }
                }

                int sum = 0;

                for (int i = 2; i <= n; i++) {
                    if (prime[i])
                        sum += i;
                }

                return sum;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-all-prime-numbers-between-1-and-n4404/1)