# Nth Fibonnaci Last Digit

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a number  **n**, find the last digit of the  **nth** Fibonacci number. The Fibonacci sequence is a series in which each number is the sum of the previous two numbers, where  **F(0) = 0**,  **F(1) = 1**, and  **F(n) = F(n-1) + F(n-2)** for  **n >= 2**.

 **Examples :** 

```
Input: n = 5
Output: 5
Explanation: The 5th Fibonacci number is 5, so its last digit is 5.
```

```
Input: n = 14
Output: 7
Explanation: 14th Fibonacci number is 377. It's last digit is 7

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T13:55:38.652Z  

```java
class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int c = (a + b) % 10;
            a = b;
            b = c;
        }

        return b;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-nth-fibonnaci3150/1)