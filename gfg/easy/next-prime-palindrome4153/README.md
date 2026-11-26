# Next Prime Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive integer  **n,** find the smallest number greater than or equal to  **n** that is a prime and a palindrome.

 **Examples :** 

```
Input: n = 12
Output: 101
Explanation: 101 is the smallest number greater than equals to 12 that is palindrome as well a prime number.
```

```
Input: n = 4
Output: 5
Explanation: 5 is the smallest number greater than equals to 4 that is palindrome as well a prime number.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T06:40:24.213Z  

```java
class Solution {

    public int primePalindrome(int n) {
        while (true) {
            if (isPalindrome(n) && isPrime(n))
                return n;

            n++;

            if (1000 <= n && n < 10000)
                n = 10000;
            else if (100000 <= n && n < 1000000)
                n = 1000000;
            else if (10000000 <= n && n < 100000000)
                n = 100000000;
        }
    }
    private boolean isPalindrome(int n) {
        int rev = 0, temp = n;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == n;
    }

    private boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/next-prime-palindrome4153/1)