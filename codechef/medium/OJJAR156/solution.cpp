function Parent() {
  const [count, setCount] = useState(0);

  // ❌ New function on every render
  const handleIncrement = useCallback(() => {
    setCount(c => c + 1);
  }, []);

  return (
    <div className="parent-container">
      <p className="counter-text">Count: {count}</p>
      <ChildButton onClick={handleIncrement} />
    </div>
  );
}

export default Parent;

});
  );
    </button>
      Increment Counter
    <button className="child-button" onClick={onClick}>
  return (
const ChildButton = memo(function ({ onClick }) {
  console.log('Child rendered!'); // 
// Memoized child component

import './App.css';
import { useState, memo, useCallback } from 'react';