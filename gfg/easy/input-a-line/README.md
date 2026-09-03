# Input a Line

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Read a string  **s,** that may contain multiple words separated by spaces.

 **Examples :** 

```
Input: s = "hello world"
Output: hello world
```

```
Input: s = "Welcome to GeeksForGeeks"
Output: Welcome to GeeksForGeeks
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T16:10:01.541Z  

```java
import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void getLine() {
        String s = sc.nextLine();

        System.out.println(s);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/input-a-line/1)