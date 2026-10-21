# VBHXB283

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Redis- Practice Problem

In this exercise, you will integrate  **Redis**  with an Express.js application to persist and retrieve key–value pairs. This helps you understand how to use Redis as a simple in-memory database.

 **Problem Statement** 

Build an Express server with the following requirements:

- POST /store Accepts a JSON body containing { "key": "someKey", "value": "someValue" }. Stores the key–value pair in Redis. Responds with: Stored key: <key> with value: <value>
- GET /retrieve/:key Looks up the value for the given key in Redis. If the key exists, respond with: Retrieved: <value> If the key does not exist, respond with: Key not found

 **Example Usage**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T14:46:36.133Z  

```cpp
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

```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB283)