# Simple Interest

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given three integers  **p**,  **r** and  **t**, denoting Principal, Rate of Interest and Time period respectively. Calculate and print the Simple Interest.

 **Examples:** 

```
Input: p = 100, r = 20, t = 2
Output: 40.00
Explanation: The simple interest on 100 at a rate of 20% across 2 time periods is 40.
```

```
Input: p = 999, r = 9, t = 9
Output: 809.19
Explanation: The simple interest on 999 at a rate of 9% across 9 time periods is 809.19
```

 **Constraints:** 
1 ≤ p ≤ 105
1 ≤ r, t ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T09:14:55.943Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        double si = p * r * t / 100.0;

        System.out.printf("%.2f%n", si);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/simple-interest3457/1)