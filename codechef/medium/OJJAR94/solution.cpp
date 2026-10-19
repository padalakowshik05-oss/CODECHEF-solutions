function TextInput({ value, onChange }) {
   // Each box has its own 'text' state
  return <input value={value} onChange={onChange} />;
}

function App() {
  return (
    <div>
      <h2>Type in either box:</h2>

      <TextInput value={sharedText} onChange={handleTextChange}/> {/* This box's state is separate */}
      <br />
      <TextInput value={sharedText} onChange={handleTextChange} /> {/* This box's state is separate */}
      <p>Current Shared Text: {sharedText}</p>
    </div>
  );
}
// Result: Typing in one box does nothing to the other.

  const [sharedText, setSharedText] = useState('');

  const handleTextChange = (event) => {
    setSharedText(event.target.value);
  };

export default App;