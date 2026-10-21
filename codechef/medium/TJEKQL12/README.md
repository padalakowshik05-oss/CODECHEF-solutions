# TJEKQL12

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Time Logger Middleware

Let's build a "Time Logger Middleware". This middleware will log the time of each incoming request to your Express application. This can be helpful for debugging or monitoring the performance of your application.

#### Task:

You need to create an Express application with two routes: `/`. You'll also create a custom middleware called `timeLogger` that does the following:

- For each incoming request, it should: Get the current date and time using new Date(). Log the route and the current time to the console in the format: Route: [route], Time: [time]. Call next() to pass control to the next middleware or route handler.
#### Expected output:
#### Note:

The server should run on port 3000.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T15:55:33.466Z  

```cpp
const express = require('express');
const app = express();
const PORT = 3000;

// Custom timeLogger middleware
const timeLogger = (req, res, next) => {
  const currentTime = new Date();
    console.log(`Route: ${req.originalUrl}, Time: ${currentTime}`);
      next();
      };

      // Apply middleware globally
      app.use(timeLogger);

      // Root route
      app.get('/', (req, res) => {
        res.send('Welcome to the home page!');
        });

        // Additional route to fulfill the two routes requirement
        app.get('/about', (req, res) => {
          res.send('About page');
          });

          // Start the server
          app.listen(PORT, () => {
            console.log(`Server listening on port ${PORT}`);
            });

```

---

[View on CodeChef](https://www.codechef.com/problems/TJEKQL12)