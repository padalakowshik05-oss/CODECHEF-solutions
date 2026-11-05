# Factorials Less than or Equal to n

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A number  **n**  is called a factorial number if it is the factorial of a positive integer. For example, the first few factorial numbers are 1, 2, 6, 24, 120,
Given a number  **n**, the task is to return the list/vector of the factorial numbers smaller than or equal to n.

 **Examples:** 

```
Input: n = 3
Output: 1 2
Explanation: The first factorial number is 1 which is less than equal to n. The second number is 2 which is less than equal to n,but the third factorial number is 6 which is greater than n. So we print only 1 and 2.
```

```
Input: n = 6
Output: 1 2 6
Explanation: The first three factorial numbers are less than equal to n but the fourth factorial number 24 is greater than n. So we print only first three factorial numbers.
```

 **Constraints:** 
1<=n<=1018

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T19:56:12.565Z  

```java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> list = new ArrayList<>();

        long fact = 1;

        for (long i = 1; ; i++) {
            fact *= i;

            if (fact > n) {
                break;
            }

            list.add(fact);
        }

        return list;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/1)