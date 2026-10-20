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