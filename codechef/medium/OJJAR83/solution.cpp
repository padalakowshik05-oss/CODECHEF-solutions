        
      </div>
        <span>{unit}</span>
      <div className={styles.controls}>
        {/* Button to increase the temperature */}
        <button onClick={() => setTemperature((prev) => prev + 1)}>
          Increase
        </button>
        
        {/* Button to decrease the temperature */}
        <button onClick={() => setTemperature((prev) => prev - 1)}>
          Decrease
        </button>
        
        
        {/* Button to convert between Celsius and Fahrenheit */}
        <button onClick={convertTemperature}>
          {unit === "C" ? "Convert to Fahrenheit" : "Convert to Celsius"}
        </button>
        
      </div>
    </div>
  );
}

export default function App() {
  return <Temperature />;
}
        {temperature.toFixed(2)}
        {/* Display the current temperature with the appropriate unit */}
      <div className={styles.display}>
      <h1>Temperature Converter</h1>
    <div className={styles.wrapper}>