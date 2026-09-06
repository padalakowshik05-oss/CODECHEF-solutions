# Lower case to upper case

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **str** containing only lowercase letters, generate a string with the same letters, but in uppercase.

 **Example 1:** 

```
Input:
str = "geeks"
Output: GEEKS
```

 **Example 2:** 

```
Input:
str = "geeksforgeeks"
Output: GEEKSFORGEEKS
```

 **Your Task:** 
You don't need to read input or print anything. Your task is to complete the function  **to_upper()** which takes the string str as an argument and returns the resultant string.

 **Expected Time Complexity:** O(length of the string).
 **Expected Auxiliary Space:** O(1).

 **Constraints:** 
1 ≤ length of the string ≤ 50

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T09:18:56.609Z  

```java
class Solution {
    String to_upper(String str) {
        return str.toUpperCase();
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/lower-case-to-upper-case3410/1)