# Count of camel case characters

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string. Count the number of Camel Case characters in it.

 **Example 1:** 

```
Input:
S = "ckjkUUYII"
Output: 5
Explanation: Camel Case characters present:
U, U, Y, I and I.

```

â€‹ **Example 2:** 

```
Input: 
S = "abcd"
Output: 0
Explanation: No Camel Case character
present.

```

 **Your Task:** 
You don't need to read input or print anything. Your task is to complete the function  **countCamelCase()** which takes the string S as input and returns the count of the camel case characters in the string.

 **Expected Time Complexity:** O(|S|).
 **Expected Auxiliary Space:** O(1).

 **Constraints:** 
1<=|S|<=105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T15:05:09.280Z  

```java
class Sol {
    int countCamelCase(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                count++;
            }
        }
        return count;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-camel3348/1)