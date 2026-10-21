# OJJAR224

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Tic-tac-toe 2

In this component, you will implement the core logic that determines the winner of a Tic-Tac-Toe game.

The function `calculateWinner(squares)` takes an array of 9 elements (each representing a square) and returns:

- 'X' if player X has won
- 'O' if player O has won
- null if there is no winner yet

This function will be used by the game to display the winner once any winning condition is met.

 **Requirements** 

You need to:

- Define all possible winning line combinations (rows, columns, and diagonals).
- Check each combination to see if it contains the same non-null symbol ('X' or 'O').
- Return the symbol ('X' or 'O') if a winning combination is found.
- If no winner exists after checking all lines, return null.

 **Example** 

 **Helpful Resources** 

- React Tic-Tac-Toe Tutorial (Official) https://reactjs.org/tutorial/tutorial.html#declaring-a-winner
- Array Destructuring in JS https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Destructuring_assignment
- Looping through Arrays https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for...of

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T12:56:02.521Z  

```cpp
    status = `Winner: ${winner}`;
  } else {
    status = `Next player: ${xIsNext ? 'X' : 'O'}`;
  }

  return (
    <>
      <div className="status">{status}</div>
      <div className="board-row">
        <Square value={squares[0]} onClick={() => handleClick(0)} />
        <Square value={squares[1]} onClick={() => handleClick(1)} />
        <Square value={squares[2]} onClick={() => handleClick(2)} />
      </div>
      <div className="board-row">
        <Square value={squares[3]} onClick={() => handleClick(3)} />
        <Square value={squares[4]} onClick={() => handleClick(4)} />
        <Square value={squares[5]} onClick={() => handleClick(5)} />
      </div>
      <div className="board-row">
        <Square value={squares[6]} onClick={() => handleClick(6)} />
        <Square value={squares[7]} onClick={() => handleClick(7)} />
        <Square value={squares[8]} onClick={() => handleClick(8)} />
      </div>
    </>
  );
}

export default Board;
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR224)