# Juggler Sequence

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Juggler Sequence is a series of integers in which the first term starts with a positive integer number  *a*  and the remaining terms are generated from the immediate previous term using the below recurrence relation:

Given a number n, find the Juggler Sequence for this number as the first term of the sequence until it becomes 1.

 **Examples:** 

```
Input: n = 9
Output: 9 27 140 11 36 6 2 1
Explaination: We start with 9 and use 
above formula to get next terms.
```

```
Input: n = 6
Output: 6 2 1
Explaination: 
[61/2] = 2. 
[21/2] = 1.
```

 **Constraints:** 
1 ≤ n ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T06:16:47.303Z  

```java
import java.util.ArrayList;
import java.util.List;
class Solution {
    static List<Long> jugglerSequence(long n) {
        List<Long> res = new ArrayList<>();
        long val = n;
        res.add(val);
        while (val != 1) {
            if (val % 2 == 0) 
                val = (long) Math.floor(Math.sqrt(val));
            else 
                val = (long) Math.floor(Math.pow(val, 1.5));
            res.add(val);
        }
        return res;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/juggler-sequence3930/1)