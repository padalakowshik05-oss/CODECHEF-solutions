# VBHXB22

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Simulate File Processing with Error Handling

Let's practice how to handle errors in using different functions:

### Task:
- Complete the code to handle errors using async/await.
- Complete the code to handle errors using.then()/.catch().
- Complete the code to handle errors using callback function and print the result or error in the given way:

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T07:31:51.155Z  

```cpp
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
  
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB22)