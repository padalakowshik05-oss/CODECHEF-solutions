# LCM of Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **a[]**  of  **n**  numbers, find the Least Common Multiple (LCM) of all the elements of the array. The LCM of an array is the smallest number that is divisible by every element of the array.

 **Examples:** 

```
Input: a[] = [1, 2, 8, 3]
Output: 24
Explanation: LCM of 1, 2, 8 and 3 is 24 since 24 is the smallest number divisible by all of them.
```

```
Input: a[] = [1, 8]
Output: 8
Explanation: LCM of 1 and 8 is 8 since 8 is the smallest number divisible by both.

```

 **Constraints:** 
1 <= n <= 10
1 <= a[i] <= 20

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T06:41:39.469Z  

```java
class Solution {
    public int lcmOfArray(int[] a) {
        int lcm = 1;

        for (int x : a) {
            lcm = (lcm * x) / gcd(lcm, x);
        }

        return lcm;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/lcm-of-given-array-elements3919/1)