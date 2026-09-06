# CRDGAME - Rating 1125

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Chef and Card Game

Chef is playing a card game with his friend Morty Smith.

The rules of the game are as follows:

- There are two piles of cards, pile $A$ and pile $B$, each with $N$ cards in it. Pile $A$ belongs to Chef and pile $B$ belongs to Morty.
- Each card has one positive integer on it
- The ‘power’ of a card is defined as the sum of digits of the integer on that card
- The game consists of $N$ rounds
- In each round, both players simultaneously draw one card each from the top of their piles and the player who draws the card with higher power wins this round and gets a point. If the powers of both players' cards are equal then they get $1$ point each.
- The winner of the game is the player who has more points at the end of $N$ rounds. If both players have equal number of points then the game ends in a draw.

The game is now over and Chef has told Morty to find the winner. Unfortunately, this task is too complex for him. Help Morty find the winner.

### Input:
- First line will contain $T$, number of testcases.
- The first line of each test case will contain $N$, the number of rounds played.
- The $i^{th}$ of the next $N$ lines of each test case will contain $A_i$ and $B_i$, the number on the card drawn by Chef and Morty respectively in round $i$.
### Output:

For each test case, output two space separated integers on a new line:
Output

- $0$ if Chef wins,
- $1$ if Morty wins,
- $2$ if it is a draw, followed by the number of points the winner had. (If it is a draw then output either player’s points).
### Constraints
- $1 \leq T \leq 1000$
- $1 \leq N \leq 100$
- $1 \leq A_i, B_i \leq 10^9$
### Subtasks
- $100$ points : No additional constraints
### Sample 1:
Input
Output

```
2
3
10 4
8 12
7 6
2
5 10
3 4
```

```
0 2
2 1
```

### Explanation:

 **Test Case**  $1$:

 **Round**  $1$:

Chef’s card has power $1+0$ = $1$,
Morty’s card has power $4$.
Therefore, Morty wins the round.

 **Round**  $2$:

Chef’s card has power $8$,
Morty’s card has power $1 + 2$ = $3$.
Therefore, Chef wins the round.

 **Round**  $3$:

Chef’s card has power $7$,
Morty’s card has power $6$.
Therefore, Chef wins the round.

Therefore, Chef wins the game with $2$ points (Morty has $1$ point).

 **Test Case**  $2$:

 **Round**  $1$:

Chef’s card has power $5$,
Morty’s card has power $1 + 0 = 1$.
Therefore, Chef wins the round.

 **Round**  $2$:

Chef’s card has power $3$,
Morty’s card has power $4$.
Therefore, Morty wins the round.

Therefore, the game ends in a draw and both players have $1$ point each.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T08:39:20.611Z  

```java
import java.util.*;

class Codechef {

    static int digitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();

            int chefPoints = 0;
            int mortyPoints = 0;

            for (int i = 0; i < N; i++) {

                int A = sc.nextInt();
                int B = sc.nextInt();

                int chefPower = digitSum(A);
                int mortyPower = digitSum(B);

                if (chefPower > mortyPower) {
                    chefPoints++;
                } 
                else if (mortyPower > chefPower) {
                    mortyPoints++;
                } 
                else {
                    chefPoints++;
                    mortyPoints++;
                }
            }

            if (chefPoints > mortyPoints) {
                System.out.println("0 " + chefPoints);
            } 
            else if (mortyPoints > chefPoints) {
                System.out.println("1 " + mortyPoints);
            } 
            else {
                System.out.println("2 " + chefPoints);
            }
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CRDGAME)