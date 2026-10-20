# OJJAR199

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Spawning Tiles

Okay, great job setting up the initial grid! Now, let's move on to the next crucial part of the 2048 game:  **adding random tiles (2s or 4s) to empty spots on the board.** 

- Choose an empty cell at random Empty cells must have the CSS classes cell cell-0. Occupied cells (holding any number) must have the classes cell cell-1.
- Insert a new tile (2 or 4) $90 \%$ probability $→ 2$ $10 \%$ probability $→ 4$
- Kick-off the game with two random tiles Repeat Step 2 twice on load, selecting different empty cells each time.

 **Hint: When you render each square, you can bind its classes like** 

```
className={`cell cell-${cell}`}

```

so `cell-0` means empty and `cell-1` (or higher) means occupied.

 **Your App should work like that(Ensure each render places the number randomly.)** 

#### Hints addRandomTile function

```
function addRandomTile(board) {
  const newBoard = board.map(row => [...row]);
  const emptyTiles = [];

  // Find all empty cells
  for (let r = 0; r < SIZE; r++) {
    for (let c = 0; c < SIZE; c++) {
      if (newBoard[r][c] === 0) {
        emptyTiles.push([r, c]); 
      }
    }
  }

  // If no empty cells, return the board (no change)
  if (emptyTiles.length === 0) {
    return newBoard;
  }

  // Randomly select one of the empty cells
  const [r, c] = emptyTiles[getRandomInt(emptyTiles.length)];

  // Place a 2 (90% chance) or a 4 (10% chance)
  newBoard[r][c] = Math.random() < 0.9 ? 2 : 4;

  return newBoard;
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T14:18:01.825Z  

```cpp
  const [r, c] = emptyTiles[getRandomInt(emptyTiles.length)];
  newBoard[r][c] = Math.random() < 0.9 ? 2 : 4;
  }

    return newBoard;
  if (emptyTiles.length === 0){
  }
    }
      }
        emptyTiles.push([r, c]);
      if (newBoard[r][c] == 0){
    for(let c=0; c< SIZE; c++){
  for(let r = 0; r< SIZE; r++){

  const emptyTiles = [];
  const newBoard = board.map(row => [...row]); // Start with a copy
  
function addRandomTile(board) {


}
  return Math.floor(Math.random() *max);
function getRandomInt(max) {


}
  return Array(SIZE).fill(null).map(() => Array(SIZE).fill(0));
function getEmptyBoard() {

const SIZE = 4;

import './App.css'; 
import { useState } from 'react';
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR199)