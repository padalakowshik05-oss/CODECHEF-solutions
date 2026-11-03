# Armstrong Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a **3-digit**  number  **n**, Find whether it is an  **Armstrong** number or not.

An  *Armstrong number*  of three digits is a number such that the sum of the cubes of its digits is equal to the  *number* itself. 371 is an Armstrong number since 33 + 73 + 13 = 371. 

 **Examples:** 

```
Input: n = 153
Output: true
Explanation: 153 is an Armstrong number since 13 + 53 + 33 = 153. 

```

```
Input: n = 372
Output: false
Explanation: 372 is not an Armstrong number since 33 + 73 + 23 = 378. 

```

```
Input: n = 100
Output: false
Explanation: 100 is not an Armstrong number since 13 + 03 + 03 = 1. 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T04:46:06.339Z  

```java
class Solution {
    static boolean armstrongNumber(int n) {
        int temp=n;
        int sum=0;
        for(int i=0;i<3;i++){
            int d=n%10;
            sum+=Math.pow(d,3);
            n=n/10;
        }
        return sum==temp;


    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1)