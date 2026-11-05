# All Divisors of Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer  **n,**  return all the divisors of n in the ascending order.
 
 **Examples:** 

```
Input : n = 20
Output: 1 2 4 5 10 20
Explanation: 20 is completely divisible by 1, 2, 4, 5, 10 and 20.

```

```
Input: n = 21191
Output: 1 21191
Explanation: As 21191 is a prime number, it has only 2 factors(1 and the number itself).
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T19:39:16.193Z  

```java
class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
               ArrayList<Integer> second = new ArrayList<>();

               for (int i = 1; i <= n / i; i++) {
                   if (n % i == 0) {
                       list.add(i);

                       if (i != n / i) {
                           second.add(n / i);
                       }
                   }
               }

               for (int i = second.size() - 1; i >= 0; i--) {
                   list.add(second.get(i));
               }

               return list;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/all-divisors-of-a-number/1)