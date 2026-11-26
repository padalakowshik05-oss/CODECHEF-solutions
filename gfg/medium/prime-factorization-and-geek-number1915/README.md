# Check if All Prime Factors are Distinct

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a number, check if all prime factors appear only once in prime factorization.

 **Examples:** 

```
Input: n = 22
Output: true
Explaination: 22 = 21111. Here all the powers of prime numbers are one.
```

```
Input: n = 4
Output: false
Explaination: 4 = 22. Here all the powers of all the prime are not one.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T12:56:28.306Z  

```java
class Solution {
    boolean distinctPF(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % (i * i) == 0) {
                return false;
            }
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/prime-factorization-and-geek-number1915/1)