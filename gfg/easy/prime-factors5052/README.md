# Unique Prime Factors in Sorted Order

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a number  **n**. Find its unique prime factors in increasing order.

 **Examples :** 

```
Input: n = 100
Output: [2, 5]
Explanation: Unique prime factors of 100 are 2 and 5.

```

```
Input: n = 60
Output: [2, 3, 5]
Explanation: Prime factors of 60 are 2, 2, 3, 5. Unique prime factors are 2, 3 and 5.

```

 **Constraints:** 
1 ≤ n ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T05:26:05.094Z  

```java
class Solution {
    public static ArrayList<Integer> primeFac(int n) {
       
         ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                ans.add(i);

                
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        
        if (n > 1) {
            ans.add(n);
        }

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/prime-factors5052/1)