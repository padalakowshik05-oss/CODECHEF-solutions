const range = (start, end, step = 1) => {
  let result = [];

  if (typeof end === 'undefined') {
    end = start;
    start = 0;
  }

  for (let i = start; i < end; i += step) {
    result.push(i);
  }

  return result;
};

// update this function 
function NumberBoxes({ count }) {  
  return (  
    <ul>
      




    </ul>
  );  
}

export default function App() {
  return (
      {range(count).map((num) => (
        <li key={num}>{num + 1}</li>
      ))}