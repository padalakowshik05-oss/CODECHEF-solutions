
app.use(express.urlencoded({ extended: true }));

// Serve CSS and other static files from public folder
app.use(express.static(path.join(__dirname, 'public')));

// Set EJS as the view engine
app.set('view engine', 'ejs');

// View to serve the frontend files from views folder
app.set('views', path.join(__dirname, 'views'));

// Route for home page
app.get('/', (req, res) => {
  res.render('index');
const fs = require('fs');

const app = express();
const PORT = process.env.PORT || 3000;
const path = require('path');
const express = require('express');