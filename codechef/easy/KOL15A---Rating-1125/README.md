# KOL15A - Rating 1125

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Processing a string

Given an alphanumeric string made up of digits and lower case Latin characters only, find the sum of all the digit characters in the string.

### Input
- The first line of the input contains an integer T denoting the number of test cases. Then T test cases follow.
- Each test case is described with a single line containing a string S, the alphanumeric string.
### Output
- For each test case, output a single line containing the sum of all the digit characters in that string.
### Constraints
- 1 ≤ T ≤ 1000
- 1 ≤ |S| ≤ 1000, where |S| is the length of the string S.
### Sample 1:
Input
Output

```
1
ab1231da

```

```
7
```

### Explanation:

The digits in this string are 1, 2, 3 and 1. Hence, the sum of all of them is 7.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T08:36:30.789Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int sum = 0;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (Character.isDigit(ch)) {
                    sum += ch - '0';
                }
            }

            System.out.println(sum);
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/KOL15A)