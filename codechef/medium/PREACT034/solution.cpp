  return (
    <div className={styles.wrapper}>
      <h1>Temperature Converter</h1>
      <div className={styles.display}>
        {temperature.toFixed(2)}
        <span>°{unit}</span>
      </div>
      <div className={styles.controls}>
        {/* Button to increase the temperature */}
        <button onClick={() => setTemperature(temperature + 1)}>
          Increase
        </button>

        {/* Button to decrease the temperature */}
        <button onClick={() => setTemperature(temperature - 1)}>
          Decrease
        </button>

        {/* Button to convert between Celsius and Fahrenheit */}
        <button onClick={convertTemperature}>
          Convert to {unit === "C" ? "Fahrenheit" : "Celsius"}
        </button>
      </div>
    </div>
  );
}

export default Temperature;