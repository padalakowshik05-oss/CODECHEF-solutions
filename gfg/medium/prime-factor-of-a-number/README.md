# All Prime Factors in Any Order

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a positive integer  **n**, return its prime factors in any order.  A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.

 **Examples:** 

```
Input: n = 18 
Output: [2, 3, 3]
Explanation: Prime Factorization of 18 is 2 * 32.
```

```
Input: n = 25
Output: [5, 5]
Explanation: Prime Factorization of 25 is 52.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T13:17:58.062Z  

```java
class Solution {
    ArrayList<Integer> primeFactors(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                ans.add(i);
                n/=i;
            }
        }
        if(n>1){
            ans.add(n);
        }
        return ans;
        
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/prime-factor-of-a-number/1)