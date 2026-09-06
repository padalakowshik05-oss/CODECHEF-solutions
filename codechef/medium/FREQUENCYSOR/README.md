# FREQUENCYSOR

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Chef and Character Frequency Sort

Chef is experimenting with strings. He wants to rearrange all the characters of a given string  **$S$**  in decreasing order of their frequency.

If two characters have the same frequency, Chef sorts them in  **lexicographical (ASCII) order**.

Help Chef by printing the final rearranged string.

### Function Declaration
- Function Name: $sortByFrequency$
- Parameters: $s$ ($string$) A string consisting of uppercase and lowercase English letters and digits.
- Return Value: Returns a $string$ representing the rearranged string after sorting by the given rules.
### Input Format
- The first and only line contains a string S.
- The string consists of uppercase and lowercase English letters and digits.
### Output Format

Print the rearranged string after sorting by the given rules.

### Constraints
- $1 \le |S| \le 5 \times 10^{5}$
### Sample 1:
Input
Output

```
CookBook

```

```
ooookkBC

```

### Explanation:

 **Input:**  `CookBook`

The character frequencies are:

- o $\rightarrow$ 4
- B $\rightarrow$ 1
- C $\rightarrow$ 1
- k $\rightarrow$ 1

Chef first places characters in  **decreasing frequency**  order, so `o` comes first as `oooo`. The remaining characters all have the same frequency  **1**, so they are arranged in  **ASCII (lexicographical) order** :

`k < B < C`

So the final rearranged string is:

```
ooookkBC

```

### Sample 2:
Input
Output

```
aabbbcddd

```

```
bbbdddaac

```

### Explanation:

 **Input:**  `aabbbcddd`

The character frequencies are:

- b $\rightarrow$ 3
- d $\rightarrow$ 3
- a $\rightarrow$ 2
- c $\rightarrow$ 1

Characters with frequency  **3**  are `b` and `d`, and since `b < d`, they appear as: `bbbddd`

Then `a` appears twice: `aa`

Finally, `c` appears once: `c`

So the final rearranged string is:

```
bbbdddaac

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T08:52:23.880Z  

```java
public static String sortByFrequency(String s) {

    int[] freq = new int[128];

    // Count frequency of each character
    for (int i = 0; i < s.length(); i++) {
        freq[s.charAt(i)]++;
    }

    // Store characters that occur
    Character[] chars = new Character[62];
    int count = 0;

    for (int i = 0; i < 128; i++) {
        if (freq[i] > 0) {
            chars[count++] = (char) i;
        }
    }

    // Sort:
    // 1. Higher frequency first
    // 2. ASCII order if frequency is same
    Arrays.sort(chars, 0, count, (a, b) -> {
        if (freq[a] != freq[b]) {
            return Integer.compare(freq[b], freq[a]);
        }

        return Character.compare(a, b);
    });

    // Build result
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < count; i++) {
        char ch = chars[i];

        for (int j = 0; j < freq[ch]; j++) {
            result.append(ch);
        }
    }

    return result.toString();
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FREQUENCYSOR)