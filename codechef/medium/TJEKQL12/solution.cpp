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
