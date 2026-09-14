# Smallest Number In One Swap

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a non-negative integer represented as a string  **s**, find the smallest possible number that can be obtained by performing at most one swap of two digits. The output should not contain leading zeros.

 **Examples:** 

```
Input: s = "9625635"
Output: "2695635"
Explanation: Swapped the digits 9 and 2.
```

```
Input: s = "1205763"
Output: "1025763"
Explanation: Swapped the digits 0 and 2.
```

```
Input: s = "123"
Output: "123"
Explanation: No swapping required
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T13:59:43.812Z  

```java
class Solution {
    public String smallestNumber(String s) {
        char[] a = s.toCharArray();
               int[] last = new int[10];

               for (int i = 0; i < a.length; i++)
                   last[a[i] - '0'] = i;

               for (int i = 0; i < a.length; i++) {

                   for (int d = 0; d < a[i] - '0'; d++) {

                       if (i == 0 && d == 0)
                           continue;

                       if (last[d] > i) {

                           int j = last[d];

                           char temp = a[i];
                           a[i] = a[j];
                           a[j] = temp;

                           return new String(a);
                       }
                   }
               }

               return s;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-number-in-one-swap0010/1)