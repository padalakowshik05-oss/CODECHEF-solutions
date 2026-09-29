# Intersection of Arrays with Distinct

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two  **unsorted**  integer arrays  **a[]**  and  **b[]** each consisting of  **distinct**  elements, the task is to return the  **count**  of elements in the  **intersection**  (or common elements) of the two arrays.

Intersection of two arrays can be defined as the set containing distinct common elements between the two arrays. 

 **Examples:** 

```
Input: a[] = [89, 24, 75, 11, 23], b[] = [89, 2, 4]
Output: 1
Explanation: 89 is the only element in the intersection of two arrays.
```

```
Input: a[] = [1, 2, 4, 3, 5, 6], b[] = [3, 4, 5, 6, 7]
Output: 4
Explanation: 3, 4, 5, and 6 are the elements in the intersection of two arrays.
```

```
Input: a[] = [20, 10, 30, 50, 40], b[] = [15, 25, 30, 20, 35]
Output: 2
Explanation: 20 and 30 are the elements in the intersection of the two arrays.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T17:38:50.438Z  

```java
class Solution {
    public static int intersectSize(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);
        int n=a.length;
        int m=b.length;
        int i=0;
        int j=0;
        int count=0;
        while(i<n && j<m){
            if(a[i]==b[j]){
                count++;
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return count;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1)