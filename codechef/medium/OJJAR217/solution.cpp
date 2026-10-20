
// 2. Write the Reducer function <<-- YOU WILL FILL THIS IN!
function reducer(state, action) {
  console.log(`Reducer received action: ${action.type}`);

  // --- Your Code Starts Here ---

  switch (action.type) {
    case 'INCREMENT' : {

    default: // Example default case
      console.log('Unknown action type');
      return state;
  }

  // --- Your Code Ends Here ---
}

// 3. The Counter Component
function Counter() {
      return { count: state.count + 1};
    }
    case 'DECREMENT': {
      return { count: state.count - 1};
    }
    case 'RESET': {
      return { count: 0 };
    }
  // Setup useReducer
  const [state, dispatch] = useReducer(reducer, initialState);

  return (
    <div className="counter">