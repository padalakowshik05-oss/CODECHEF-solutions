# Common in 3 Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given three sorted arrays in non-decreasing order, return all common elements in non-decreasing order across these arrays.

- If there are no common, return an empty array.
- Include each common element only once in the output.

 **Examples :** 

```
Input: a[] = [1, 5, 10, 20, 40, 80], b[] = [6, 7, 20, 80, 100], c[] = [3, 4, 15, 20, 30, 70, 80, 120]
Output: [20, 80]
Explanation: The elements 20 and 80 appear in all three arrays a, b, and c, making them the only common elements, so the output is [20, 80].
```

```
Input: a[] = [1, 2, 3, 4, 5], b[] = [6, 7], c[] = [8, 9, 10]
Output: []
Explanation: Since none of the elements in arrays a, b, and c appear in all three arrays, there are no common elements, so the output is [].
```

```
Input:  a[] = [1, 1, 1, 2, 2, 2], b[] = [1, 1, 2, 2, 2], c[] = [1, 1, 1, 1, 2, 2, 2, 2]
Output: [1, 2]
Explanation: Ignoring duplicates, 1 and 2 are present in all three arrays, so the output is [1, 2].
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T15:52:30.924Z  

```java
class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        ArrayList<Integer> result = new ArrayList<>();

                int i = 0, j = 0, k = 0;

                while (i < a.length && j < b.length && k < c.length) {
                    if (a[i] == b[j] && b[j] == c[k]) {
                        if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                            result.add(a[i]);
                        }
                        i++;
                        j++;
                        k++;
                    } 
                    else if (a[i] < b[j]) {
                        i++;
                    } 
                    else if (b[j] < c[k]) {
                        j++;
                    } 
                    else {
                        k++;
                    }
                }

                return result;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/common-elements1132/1)