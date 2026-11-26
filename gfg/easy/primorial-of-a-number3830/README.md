# Primorial of a Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive integer  **n**, compute its primorial. The primorial of n is the product of all prime numbers less than or equal to n.

 **Examples:** 

```
Input: n = 5
Output: 30
Explanation: The prime numbers less than or equal to 5 are 2, 3, and 5. So the primorial is: 2  *3*  5 = 30
```

```
Input: n = 12
Output: 2310
Explanation: The prime numbers less than or equal to 12 are 2, 3, 5, 7, and 11. So the primorial is: 2  *3*  5  *7*  11 = 2310
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T07:44:45.038Z  

```java
class Solution {

   
    static long primorial(int n) {
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                ans *= i;
            }
        }
        return ans;
    }

    static boolean isPrime(int num) {
        if (num < 2)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/primorial-of-a-number3830/1)