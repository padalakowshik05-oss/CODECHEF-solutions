# Add two fractions

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given four integers  **num1**,  **den1**,  **num2**, and  **den2**, representing two fractions num1/den1 and num2/den2, find their sum and return the resulting fraction in its simplified form.

Return the answer as an array of two integers:

- The first element represents the numerator.
- The second element represents the denominator.

 **Note:** The driver will print the result in the format num/den.

 **Examples :** 

```
Input: num1 = 1, den1 = 500, num2 = 2, den2 = 500
Output: [3, 500]
Explanation: In this test case 1/500 + 2/500 = 3/500.
```

```
Input: num1 = 1, den1 = 6, num2 = 1, den2 = 3
Output: [1, 2]
Explanation: 1/6 + 1/3 = 1/6 + 2/6 = 3/6 = 1/2.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T10:43:47.237Z  

```java
import java.util.*;

class Solution {
    public ArrayList<Integer> addFraction(int num1, int den1, int num2, int den2) {
        ArrayList<Integer> res = new ArrayList<>();

        int numerator = num1 * den2 + num2 * den1;
        int denominator = den1 * den2;

        int g = gcd(numerator, denominator);

        res.add(numerator / g);
        res.add(denominator / g);

        return res;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/add-two-fractions/1)