
function App() {
  return (
    <div className="container">
  );
}

const getEmptyBoard = () => {
  return Array(GRID_SIZE).fill(0).map(() => Array(GRID_SIZE).fill(0));
};
  const [board] = useState(getEmptyBoard);
      <div className="board">
    </div>
        {board.map((row, rowIndex) => (
      </div>
          <div key={rowIndex} className="row">
        ))}
            {row.map((cell, cellIndex) => (
              <div key={cellIndex} className="cell">
            ))}

                {cell !== 0 ? cell : ''}
              </div>
            </div>
export default App;