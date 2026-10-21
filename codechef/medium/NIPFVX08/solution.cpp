const express = require('express');
const mongoose = require('mongoose');

// Initialize Express app
const app = express();
const port = 3000;

// Use Atlas connection string
const mongoURI = 'mongodb+srv://CampusPlacement:sylesh@cluster0.zufsvms.mongodb.net/MyTasksDB?retryWrites=true&w=majority';

// Connect to MongoDB Atlas
mongoose.connect(mongoURI)
  .then(() => {
        console.log('✅ Connected to MongoDB Atlas');
                })
                          .catch((err) => {
                                        console.error('❌ MongoDB connection error:', err);
                                                        });

                                                        // Basic route
                                                        app.get('/', (req, res) => {
                                                          res.send('Hello from MyTasks App connected to MongoDB Atlas!');
                                                          });

                                                          // Start server
                                                          app.listen(port, () => {
                                                            console.log(`🚀 Server is running at http://localhost:${port}`);
                                                            });
