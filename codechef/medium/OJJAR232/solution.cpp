  return (
    <div className="app-container">
      <h1>Aim Training Game</h1>
      <div className="score-board">
        <p>Score: {score}</p>
        <p>Time Left: {timeLeft}s</p>
      </div>
      <div className="game-board">
        {timeLeft > 0 ? (
          circles.map((circle) => (
            <Circle
              key={circle.id}
              x={circle.x}
              y={circle.y}
              onClick={() => handleCircleClick(circle.id)}
            />
          ))
        ) : (
          <div className="game-over">
            <h2>Game Over! Final Score: {score}</h2>
          </div>
        )}
      </div>
    </div>
  );
}

export default App;