# Check Distinct Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  of size  **n**, check whether all elements in the array are distinct or not. Return true if all elements are distinct, otherwise return false.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 7]
Output: true
Explanation: All elements are unique, so no duplicates exist.
```

```
Input: arr[] = [1, 3, 2, 4, 5, 1]
Output: false
Explanation: Element 1 appears more than once, so all elements are not distinct.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T05:04:56.221Z  

```java
class Solution {
    public boolean isDistinct(int[] arr) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            if(set.contains(i)){
                return false;
            }
            set.add(i);
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/professor-and-parties2000/1)