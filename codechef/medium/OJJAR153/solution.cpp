// Parent Component
function ParentComponent() {
  const [count, setCount] = useState(0);

  return (
    <div className="parent-container">
      <button 
        className="counter-button"
        onClick={() => setCount(c => c + 1)}
      >
        Click to Increment: {count}
      </button>
      <ExpensiveOperationChild data="hello" />
});

  );
    </div>
    <div className="child-container">
      Heavy Calculation Result: {sum} (Data: {data})
  return (
  console.log('Child rendered!');


    sum += i;
  }
const ExpensiveOperationChild = memo(function ExpensiveOperationChild({ data }) {
  // Heavy computation simulation
  let sum = 0;
  for (let i = 0; i < 1000000; i++) {
// Child Component (Unoptimized)

import { useState, memo } from 'react';
import './App.css';