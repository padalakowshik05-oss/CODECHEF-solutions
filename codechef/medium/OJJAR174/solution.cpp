      <p>Primary Button (should have classes "btn btn-primary"):</p>
      <Button
        className="btn-primary"
        onClick={() => alert('Primary clicked!')}
      >
        Primary Button
      </Button>

      <p>Button trying to override type (should remain type="button"):</p>

      </Button>
        Default Button
      <Button onClick={() => alert('Default clicked!')}>
      <p>Basic Button (should have class "btn"):</p>
    <div>
  return (
function App() {
// Example Usage (You don't need to change this part)

}
  );
    </button>
      {children}
    <button {...otherProps} type="button" className={finalClassName} >
  return (
  // Hint: How should we order the props on the <button> element?
 
  const finalClassName = `btn ${className}`.trim(); // This is incorrect, needs fixing!

function Button({ children, className = '', ...otherProps }) {
      <Button
        className="btn-secondary"
        type="submit" // This should NOT change the actual button type