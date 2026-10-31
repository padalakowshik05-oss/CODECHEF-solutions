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