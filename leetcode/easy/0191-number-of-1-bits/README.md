# Number of 1 Bits

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive integer `n`, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

 

Original
Java
 **Example 1:** 

 **Input:**  n = 11

 **Output:**  3

 **Explanation:** 

The input binary string  **1011**  has a total of three set bits.

 **Example 2:** 

 **Input:**  n = 128

 **Output:**  1

 **Explanation:** 

The input binary string  **10000000**  has a total of one set bit.

 **Example 3:** 

 **Input:**  n = 2147483645

 **Output:**  30

 **Explanation:** 

The input binary string  **1111111111111111111111111111101**  has a total of thirty set bits.

 

 **Constraints:** 

- 1 <= n <= 231 - 1

 

 **Follow up:**  If this function is called many times, how would you optimize it?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 74.48%)  
**Memory:** 41.5 MB (beats 97.39%)  
**Submitted:** 2026-11-26T13:58:54.188Z  

```java
class Solution {
    public int hammingWeight(int n) {
        int cnt=0;
        while(n>0){
            if(n%2==1){
                cnt++;
            }
            n/=2;
        }
        return cnt;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-1-bits/)