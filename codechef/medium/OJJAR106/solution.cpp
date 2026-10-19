  }, []); // No cleanup

  return <h2>Count: {count}</h2>;
}

function App() {
  const [showTimer, setShowTimer] = useState(true);

  return (
    <div>
      <button onClick={() => setShowTimer(!showTimer)}>
        Toggle Timer
      </button>
      {showTimer && <Timer />}
    </div>
  );
      clearInterval(timerID);
    };
}

export default App;
