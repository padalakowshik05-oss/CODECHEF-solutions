# JBFUYU08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Todo List CRUD API

Great job on understanding the basics of mapping CRUD operations to HTTP methods! Now it's time to put that knowledge into practice.

You are building the backend for a simple To-Do List application. You have already been provided with the basic Express server setup, a Mongoose connection, and a `Todo` model.

The `Todo` model has a very simple structure:

- description: A String describing the task.
- completed: A Boolean indicating if the task is done (defaults to false).

Your job is to complete the API by implementing the four core CRUD endpoints. You need to fill in the logic for each route to interact with the MongoDB database using Mongoose.

#### Task using Mongoose functions:
- POST /todos: Complete the code to save new data in databse.
- GET /todos: Complete the code to find all the todos.
- PUT /todos/:id: Complete the code to find and update the todo with the particular id.
- DELETE /todos/:id: Complete the code to delete the todo with the given id.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T15:30:12.390Z  

```cpp
const express = require('express');
const mongoose = require('mongoose');
const app = express();

app.use(express.json());

const MONGO_URI = "mongodb+srv://CampusPlacement:padala1326@cluster0.zufsvms.mongodb.net/?appName=Cluster0"

// Connect to MongoDB Atlas
mongoose.connect(MONGO_URI, {
  useNewUrlParser: true,
  useUnifiedTopology: true
})
  .then(() => console.log('✅ Connected to MongoDB Atlas'))
  .catch(err => console.error('❌ MongoDB Atlas connection error:', err));

// Define Todo model
const TodoSchema = new mongoose.Schema({
  description: {
    type: String,
    required: true,
    trim: true
  },
  completed: {
    type: Boolean,
    default: false
  }
});

const Todo = mongoose.model('Todo', TodoSchema);

// CREATE a new todo
app.post('/todos', async (req, res) => {
```

---

[View on CodeChef](https://www.codechef.com/problems/JBFUYU08)