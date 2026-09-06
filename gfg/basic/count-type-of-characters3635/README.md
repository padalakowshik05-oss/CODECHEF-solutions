# Count Types of Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, count the occurrence of the following in it.

- Lowercase characters
- Uppercase characters
- Special characters
- Numeric Values

Note: There are no white spaces in the string.

 **Examples:** 

```
Input: s = "#GeeKs01fOr@gEEks07"
Output: [5, 8, 4, 2]
Explanation: There are 5 uppercase characters, 8 lowercase characters, 4 numeric characters and 2 special characters.
```

```
Input: s = " *GeEkS4GeEkS* "
Output: [6, 4, 1, 2]
Explanation: There are 6 uppercase characters, 4 lowercase characters, 1 numeric character and 2 special characters.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T09:32:26.087Z  

```java
class Sol {
    int[] count(String s) {

        int upper = 0;
        int lower = 0;
        int numeric = 0;
        int special = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                lower++;
            }
            else if (ch >= '0' && ch <= '9') {
                numeric++;
            }
            else {
                special++;
            }
        }

        return new int[]{upper, lower, numeric, special};
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-type-of-characters3635/1)