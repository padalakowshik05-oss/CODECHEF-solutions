# NODEPRO01A

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Setting up frontend and server

Let's begin with first making our `server.js` which will be our main server file.

To get our server running we need some files to serve as frontend.

#### Task:
- Complete the serving of public folder for css.
- Complete the serving of frontend files from views folder.
- Set the / route as home route and serve the index.ejs file from views folder.
- Create a notes folder to which works as our database.
#### Expected output after the rendering:

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T08:50:04.433Z  

```cpp

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
```

---

[View on CodeChef](https://www.codechef.com/problems/NODEPRO01A)