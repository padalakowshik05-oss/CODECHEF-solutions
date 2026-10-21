                  });
                  });

                  // 3. Header Versioning
                  // Matches /api/products-header with header 'api-version'
                  app.get("/api/products-header", (req, res) => {
                    const version = req.headers["api-version"] || "1";
                      res.json({
                          version: `v${version}`,
                              products: [`Product from Header v${version}`]
                                });
                                });

                                app.listen(PORT, () => {
                                  console.log(`Server is running on port ${PORT}`);
                                  });