
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