                                                                    });
                                                                    });

                                                                    // GET /retrieve/:key
                                                                    app.get("/retrieve/:key", (req, res) => {
                                                                        const { key } = req.params;

                                                                            redisClient.get(key, (err, reply) => {
                                                                                    if (err) {
                                                                                                return res.status(500).send("Error retrieving value");
                                                                                                        }

                                                                                                                if (reply !== null && reply !== undefined) {
                                                                                                                            res.send(`Retrieved: ${reply}`);
                                                                                                                                    } else {
                                                                                                                                                res.send("Key not found");
                                                                                                                                                        }
                                                                                                                                                            });
                                                                                                                                                            });

                                                                                                                                                            // Start the server if this file is run directly
                                                                                                                                                            if (require.main === module) {
                                                                                                                                                                app.listen(port, () => {
                                                                                                                                                                        console.log(`Server running at http://localhost:${port}`);
                                                                                                                                                                            });
                                                                                                                                                                            }

                                                                                                                                                                            module.exports = app;
