# Unique Pair in Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  in which every element appears exactly twice except for two elements that appear only once, find those two unique elements and return them in sorted order.

 **Examples:** 

```
Input: arr[] = [2, 2, 5, 5, 6, 7]
Output: [6, 7]
Explanation: 2 and 5 appear twice, while 6 and 7 appear only once.

```

```
Input: arr[] = [1, 3, 4, 1]
Output: [3, 4]
Explanation: 1 appears twice, while 3 and 4 appear only once.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T06:35:58.119Z  

```java
import java.util.*;
class Solution
{
    public ArrayList<Integer> findUniquePair(int[] arr)
    {
        int xor = 0;
        for(int x : arr)
            xor ^= x;
        int rightbit = xor & -xor;
        int oddbucket = 0;
        int evenbucket = 0;
        for(int x : arr)
        {
            if((x & rightbit) != 0)
                oddbucket ^= x;
            else
                evenbucket ^= x;
        }
        return new ArrayList<>(
            Arrays.asList(
                Math.min(oddbucket, evenbucket),
                Math.max(oddbucket, evenbucket)
            )
        );
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-unique-pair-in-an-array-with-pairs-of-numbers2425/1)