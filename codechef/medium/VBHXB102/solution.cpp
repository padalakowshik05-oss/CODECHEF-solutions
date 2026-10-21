                    return res.status(400).send('Name, price, and quantity are required.');
                        }

                            // Validate name
                                if (typeof name !== 'string' || name.trim() === '') {
                                        return res.status(400).send('Name must be a non-empty string.');
                                            }

                                                // Validate price
                                                    if (typeof price !== 'number' || price <= 0) {
                                                            return res.status(400).send('Price must be a number greater than 0.');
                                                                }

                                                                    // Validate quantity
                                                                        if (typeof quantity !== 'number' || 
                                                                                !Number.isInteger(quantity) || 
                                                                                        quantity < 0) {
                                                                                                return res.status(400).send('Quantity must be an integer greater than or equal to 0.');
                                                                                                    }

                                                                                                        // If all checks pass
                                                                                                            console.log('Received product:', { name, price, quantity });
            if (name === undefined || price === undefined || quantity === undefined) {
        // Check if all required fields are present

    const { name, price, quantity } = req.body;
app.post('/products', (req, res) => {

app.use(express.json());
// Middleware to parse JSON request bodies

const app = express();
const express = require('express');