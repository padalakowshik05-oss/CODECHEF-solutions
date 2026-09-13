# Palindrome Numbers in a Range

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integers **m**  and  **n**, find all palindrome numbers between  **m**  and  **n**  (inclusive).

 **Examples:** 

```
Input: m = 10, n = 115
Output: [11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111]
Explanation: The palindrome numbers in the range [10, 115] are 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, and 111.
```

```
Input: m = 2, n = 5
Output: [2, 3, 4, 5]
Explanation: All numbers in the range [2, 5] are palindrome numbers.
```

 **Constraints:** 
1 ≤ m ≤ n ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:52:08.996Z  

```java
class Solution {
    public ArrayList<Integer> printPalindromes(int m, int n) {
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=m;i<=n;i++){
            if(isPalindrome(i)){
                arr1.add(i);
            }
        }
        return arr1;
        
    }
    static boolean isPalindrome(int i){
        int rev=0;
        int temp=i;
        while(temp>0){
            int d=temp%10;
            rev=rev*10+d;
            temp/=10;
        }
        
        return rev==i;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-all-palindromes-in-the-given-range/1)