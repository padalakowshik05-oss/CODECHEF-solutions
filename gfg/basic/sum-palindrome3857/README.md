# Sum Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number, reverse it and add it to itself unless it becomes a palindrome or return  **-1**  if the number of iterations becomes more than  **5**. Return that palindrome number if it becomes a palindrome else, it returns -1.

 **Examples:** 

```
Input: n = 23
Output: 55 
Explanation: reverse(23) = 32, then 32+23 = 55 which is a palindrome. 

```

```
Input: n = 73
Output: 121
Explanation: reverse(73) = 37, then 37+73 = 110 which is not a palindrome, again reverse(110)= 011, then 110+11 = 121 which is a palindrome.
```

 **Constraints:** 
1 <= n <= 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T05:47:43.088Z  

```java
class Solution {
    static int isSumPalindrome(int n) {
        if (n == reverse(n)) {
            return n;
        }
        for (int i = 0; i < 5; i++) {
            n = n + reverse(n);

            if (n == reverse(n)) {
                return n;
            }
        }

        return -1;
    }

    static int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }

        return rev;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-palindrome3857/1)