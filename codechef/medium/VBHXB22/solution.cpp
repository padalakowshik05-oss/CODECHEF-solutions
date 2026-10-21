      const success = Math.random() > 0.5;
      if (success) {
        callback(null, { city, temp: "30 C", condition: "Sunny" });
      } else {
          callback(`Error: Could not fetch weather for ${city}`, null);
      }




    }, 50);
  }
  
  function getWeatherCallback(city, callback) {
    fetchWeatherWithCallback(city, callback);
    setTimeout(() => {

  }
  
  
  getWeatherAsync("Delhi");
  getWeatherPromise("Mumbai");
  getWeatherCallback("Bangalore", (error, result) => {
    if (error) {
      console.log(`Callback Error:`, error);
    } else {
      console.log(`Callback:`, result);
    }
  });
  