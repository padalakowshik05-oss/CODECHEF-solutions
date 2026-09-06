# DATATYPE - Rating 1133

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Fit in Data Type

Chef wants to store some important numerical data on his personal computer. He is using a new data type that can store values only from $0$ till $N$ both inclusive. If this data type receives a value greater than $N$ then it is cyclically converted to fit into the range $0$ to $N$. For example:

- Value $N+1$ will be stored as $0$.
- Value $N+2$ will be stored as $1$.

and so on...

Given $X$, the value chef wants to store in this new data type. Determine what will be the actual value in memory after storing $X$.

### Input Format
- First line will contain $T$, number of testcases. Then the testcases follow.
- Each testcase contains a single line of input, two space separated integers $N, X$ - the maximum value a data type can store and the value Chef wants to store in the data type respectively.
### Output Format

For each testcase, output in a single line the value which will be actually stored in memory.

### Constraints
- $1 \leq T \leq 3000$
- $1 \leq N \leq 50$
- $0 \leq X \leq 50$
### Sample 1:
Input
Output

```
5
15 0
15 10
11 12
27 37
50 49
```

```
0
10
0
9
49
```

### Explanation:

 **Test Case $1$** : The data type can store values from $0$ to $15$. If we try to put $0$ in this data type, then the stored value will be the same, that is $0$.

 **Test Case $2$** : The data type can store values from $0$ to $15$. If we try to put $10$ in this data type, then the stored value will be the same, that is $10$.

 **Test Case $3$** : The data type can store values from $0$ to $11$. If we try to put $12$ in this data type, then the stored value will cyclically come back to $0$. Hence the output is $0$.

 **Test Case $4$** : The data type can store values from $0$ to $27$. If we try to put $37$ in this data type, then the stored value will cyclically convert to $9$. Hence the output is $9$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T08:48:58.589Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();
            int X = sc.nextInt();

            System.out.println(X % (N + 1));
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DATATYPE)