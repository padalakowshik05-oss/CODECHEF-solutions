# Minimum Time with Alternating Techniques

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two arrays a[] and b[] of equal size, where a[i] and b[i] denote the time required to climb the i-th step using technique 1 and technique 2, respectively, find the minimum total time required to climb all steps. Geek may start with either technique but must alternate between the two techniques at every step.

 **Examples:** 

```
Input: a[] = [2, 1, 2], b[]= [3, 2, 1]
Output: 5
Explanation: Starting with technique 1: a[0] + b[1] + a[2] = 2 + 2 + 2 = 6
Starting with technique 2: b[0] + a[1] + b[2] = 3 + 1 + 1 = 5
The minimum of the two is 5, achieved by starting with technique 2.
```

```
Input: a[] = [1, 3, 1, 2], b[]= [2, 2, 3, 1]
Output: 5
Explanation: Starting with technique 1 yields the minimum total time of 5.

```

 **Constraints:** 
1 ≤ a.size(), b.size() ≤ 105
1 ≤ a[i], b[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T08:51:59.926Z  

```java
class Solution {
    public int minTime(int[] a, int[] b) {
        int n=a.length;
        int tech1=0;
        int tech2=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                tech1+=a[i];
                tech2+=b[i];
            }
            else{
                tech1+=b[i];
                tech2+=a[i];
            }
        }
        return Math.min(tech1,tech2);
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/a-guy-with-a-mental-problem1604/1)