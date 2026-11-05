# Trimorphic Number

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer  **n**, determine whether it is a Trimorphic Number. A number is called Trimorphic if the last d digits of **n3**  are equal to n, where d is the number of digits in n.

 **Examples:** 

```
Input: n = 1
Output: true
Explanation: 13 = 1. So the cube here is ending with the number.
```

```
Input: n = 2
Output: false
Explanation: 23 = 8. The cube is not ending with the number at it's end.
```

```
Input: n = 24
Output: true
Explanation: 243 = 13824. The cube is ending with 24.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T20:46:46.402Z  

```java
class Solution {
    public boolean isTrimorphic(int n) {
        long cube = (long) n * n * n;
        return String.valueOf(cube).endsWith(String.valueOf(n));
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/trimorphic-number3553/1)