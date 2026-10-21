# VBHXB105

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Serving Book Data as JSON and HTML

Great! Now, let's solidify your understanding of response formatting. We'll create another Express application, this time focusing on serving book data.

Here's the scenario: We want to build an API endpoint `/books` that returns a list of books as JSON. The book data should include the `id`, `title`, and `author` of each book.

```
[
  { "id": 1, "title": "The Hitchhiker's Guide to the Galaxy", "author": "Douglas Adams" },
  { "id": 2, "title": "Pride and Prejudice", "author": "Jane Austen" },
  { "id": 3, "title": "1984", "author": "George Orwell" }
]

```

Additionally, we want the root route (`/`) to display a simple HTML message: `<h1>Welcome to the Book Store!</h1>`.

Your task is to create an Express application that:

- Defines a /books route that sends the book data as JSON using res.json().
- Defines the root route (/) that sends the HTML welcome message using res.send().

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T14:07:35.785Z  

```cpp

    // Books route that sends a list of books as JSON
    app.get('/books', (req, res) => {
        const books = [
                {
                            id: 1,
                                        title: "The Hitchhiker's Guide to the Galaxy",
                                                    author: "Douglas Adams"
                                                            },
                                                                    {
                                                                                id: 2,
                                                                                            title: "Pride and Prejudice",
                                                                                                        author: "Jane Austen"
                                                                                                                },
                                                                                                                        {
                                                                                                                                    id: 3,
                                                                                                                                                title: "1984",
                                                                                                                                                            author: "George Orwell"
                                                                                                                                                                    }
                                                                                                                                                                        ];
                                                                                                                                                                            res.json(books);
                                                                                                                                                                            });

                                                                                                                                                                            // Start the server
                                                                                                                                                                            const PORT = 3000;
                                                                                                                                                                            app.listen(PORT, () => {
    });
    res.send('<h1>Welcome to the Book Store!</h1>');
app.get('/', (req, res) => {
// Root route that sends an HTML welcome message
const app = express();

const express = require('express');
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB105)