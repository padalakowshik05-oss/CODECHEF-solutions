import { useState, useEffect } from "react";
import './App.css'

function BackgroundChanger() {
  const [count, setCount] = useState(0);

  useEffect(() => {

  return (
    <div className="container">
      <h1>Count: {count}</h1>
      <button className="btn" onClick={() => setCount(count + 1)}>Increase Count</button>
      <button className="btn reset-btn" onClick={() => setCount(0)}>Reset</button>
    </div>
  );
}
    if(count >= 5){
  }, [count]);
      document.body.style.backgroundColor = "lightblue";
    } else {
      document.body.style.backgroundColor = "";
    }

export default BackgroundChanger;