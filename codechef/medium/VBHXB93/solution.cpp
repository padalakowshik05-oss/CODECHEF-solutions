const express = require('express');
const app = express();
const port = 3000;

// Middleware 1: Set message
const setMessageMiddleware = (req, res, next) => {
    res.message = 'Hello World';
        next();
        };

        // Middleware 2: Convert message to uppercase
        const uppercaseMiddleware = (req, res, next) => {
            res.message = res.message.toUpperCase();
                next();
                };

                // Register middleware
                app.use(setMessageMiddleware);
                app.use(uppercaseMiddleware);

                // Route handler
                app.get('/', (req, res) => {
                    res.send(res.message);
                    });

                    app.listen(port, () => {
                        console.log(`Server running on port ${port}`);
                        });
