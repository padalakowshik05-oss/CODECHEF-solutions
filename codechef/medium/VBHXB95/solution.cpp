                                                                                                                if (denominator === 0) {
                                                                                                                            const err = new Error('Cannot divide by zero');
                                                                                                                                        err.type = 'DIV_ZERO';
                                                                                                                                                    throw err;
                                                                                                                                                            }

                                                                                                                                                                    const result = numerator / denominator;
                                                                                                                                                                            res.json({ result });
                                                                                                                                                                                } catch (err) {
                                                                                                                                                                                        next(err); // Pass error to centralized error handling middleware
                                                                                                                                                                                            }
                                                                                                                                                                                            });

                                                                                                                                                                                            // Centralized Error Handling Middleware
                                                                                                                                                                                            app.use((err, req, res, next) => {
                                                                                                                                                                                                console.error(err.stack);

                                                                                                                                                                                                    if (err.type === 'DIV_ZERO') {
                                                                                                                                                                                                            return res.status(400).json({ error: 'Cannot divide by zero.' });
                                                                                                                                                                                                                }

                                                                                                                                                                                                                    // Generic error response
                                                                                                                                                                                                                        res.status(500).json({ error: 'Something went wrong.' });
                                                                                                                                                                                                                        });

                                                                                                                                                                                                                        app.listen(port, () => {
                                                                                                                                                                                                                            console.log(`Server running at http://localhost:${port}`);
                                                                                                                                                                                                                            });