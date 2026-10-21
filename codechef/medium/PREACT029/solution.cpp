function App() {
  function addPoints(points) {
    console.log(`Added ${points} points!`);
  }

  function subtractPoints(points) {
    console.log(`Subtracted ${points} points!`);
  }

  function resetScore() {
    console.log("Score reset to 0!");
  }

  return (
    <>
      <h1>Score Tracker</h1>
      <button onClick={() => addPoints(5)}>+5 Points</button>
      <button onClick={() => subtractPoints(3)}>-3 Points</button>
      <button onClick={resetScore}>Reset</button>
    </>
  );
}

export default App;

