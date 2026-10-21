app.use(express.urlencoded({ extended: false }));

// Middleware to parse JSON data
app.use(express.json());

// Serve static files from the "public" folder
app.use(express.static(path.join(__dirname, 'public')));

// Route to handle form submissions
app.post('/add-todo-form', (req, res) => {
    console.log('Form To-Do received:');
        console.log(req.body);
            res.send('To-Do added!');
            });

            // Route to handle JSON submissions
            app.post('/add-todo-json', (req, res) => {
                console.log('JSON To-Do received:');
                    console.log(req.body);
                        res.json({
                                message: 'To-Do added!'
                                    });
                                    });

                                    // Start the server
                                    app.listen(port, () => {
                                        console.log(`Server running at http://localhost:${port}`);
                                        });
