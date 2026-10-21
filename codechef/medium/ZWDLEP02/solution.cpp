

app.post('/submit-feedback-form', (req, res) => {
  console.log('Form data received:');
  console.log(req.body);
  res.send('Feedback form data received!');
});

app.post('/submit-feedback-json', (req, res) => {
  console.log('JSON data received:');
  console.log(req.body);
  res.json({ message: 'Feedback JSON data received!' });
});

const PORT = 3000;

app.listen(PORT, () => {
  console.log(`Server listening on port ${PORT}`);
});


// Serve static files (like feedback.html)

app.use(express.json());

// Middleware to parse JSON data
app.use(express.urlencoded({ extended: false }));
// Middleware to parse URL-encoded form data
const app = express();


const path = require('path');
const express = require('express');