# Numbers with Given Digit

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two integers  **n**  and  **d**. Return an array containing all the numbers between  **0 to n**  that contain the specific digit  **d**.

 **Examples:** 

```
Input: n = 20, d = 5
Output: [5, 15]
Explanation: For number till 20, 5 appears in 5 itself and 15.
```

```
Input: n = 50, d = 2
Output: [2, 12, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 32, 42]
Explanation: For number till 50, 2 appears in all these numbers.
```

 **Constraints** :
0 ≤ n ≤ 103
0 ≤ d ≤ 9

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T19:53:54.610Z  

```java
class Solution {
    public List<Integer> findNumbers(int n, int d) {
        List<Integer> list = new ArrayList<>();

        if (d == 0) {
            list.add(0);
        }

        for (int i = 1; i <= n; i++) {
            int num = i;

            while (num > 0) {
                if (num % 10 == d) {
                    list.add(i);
                    break;
                }
                num /= 10;
            }
        }

        return list;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-number-which-contain-the-digit-d4144/1)