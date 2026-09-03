# Capitalize and Count

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string s of single space-separated words. Capitalize the first letter of all words and count the number of the words in the string. Print the line and the number in separate lines with new line character at the end.

 **Examples:** 

```
Input: s = "welcome to the world of geeks"
Output: 
Welcome To The World Of Geeks
6
```

```
Input: s = "are you enjoying programming"
Output:
Are You Enjoying Programming
4 
```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T15:57:31.444Z  

```py
s = input()

words = s.split()

for i in range(len(words)):
    words[i] = words[i][0].upper() + words[i][1:]

print(" ".join(words))
print(len(words))
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/capitalize-and-count--143718/1)