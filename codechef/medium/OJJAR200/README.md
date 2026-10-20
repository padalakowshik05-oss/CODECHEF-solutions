# OJJAR200

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Handling Player Input

Implement functionality to detect when the player presses any of the four arrow keys: `ArrowLeft`, `ArrowRight`, `ArrowUp`, or `ArrowDown`.

#### Requirements:
- Monitor keyboard events and identify when an arrow key is pressed.
- Upon detecting a key press: Log the corresponding key to the console in the following format: If the user presses the left arrow key, log: "ArrowLeft pressed" If the user presses the right arrow key, log: "ArrowRight pressed" If the user presses the up arrow key, log: "ArrowUp pressed" If the user presses the down arrow key, log: "ArrowDown pressed"

 **Your app should be work like that at the end**   **How it works** 

- Click the Toggle Console button >_.
- Console opens inside the app.
- Press the arrow keys (← ↑ → ↓) to move tiles.
- Check the console for instant move updates.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T14:24:50.342Z  

```cpp
  });
    return initialBoard;
    initialBoard = addRandomTile(initialBoard);
    initialBoard = addRandomTile(initialBoard);
    let initialBoard = getEmptyBoard();
  newBoard[r][c] = Math.random() < 0.9 ? 2 : 4;
  return newBoard;
}

function App() {
  const [board, setBoard] = useState(() => {
  const [r, c] = emptyTiles[getRandomInt(emptyTiles.length)];
  }
    return newBoard;
  if (emptyTiles.length === 0) {
  }
        emptyTiles.push([r, c]);
      }
    }
      if (newBoard[r][c] === 0) {
    for (let c = 0; c < SIZE; c++) {
  for (let r = 0; r < SIZE; r++) {
  const emptyTiles = [];
  const newBoard = board.map(row => [...row]);
function addRandomTile(board) {

function getRandomInt(max) {
  return Math.floor(Math.random() * max);
}

}
  return Array(SIZE).fill(null).map(() => Array(SIZE).fill(0));
function getEmptyBoard() {
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR200)