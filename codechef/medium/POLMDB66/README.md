# POLMDB66

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Blog Posts and Comments Modeling

Imagine you are building a simple blogging application using Node.js and MongoDB with Mongoose. In this application, users can create blog posts, and other users can write comments on these posts. A single blog post can have many comments (from zero to potentially hundreds or thousands).

### Your Task:

 **Define Mongoose Schemas** :

- Create a Post schema that includes basic fields like title, content, author,'createdAt' and a way to associate it with comments.
- Create a Comment schema that includes basic fields like text, author,'createdAt' and a way to associate it with the post it belongs to.
- Be sure to reflect your chosen approach (embedding or referencing) accurately when modeling the relationship.
#### Expected Output:

 **Post** 

 **Comments** 

You can check that the post's id is refrenced in comment's schema.

🧠  *Hint:*  Think about how you might handle thousands of comments, how you'd query individual comments, and what kind of schema relationships Mongoose supports.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T15:17:28.466Z  

```cpp
async function createPostAndComment() {
// Sample Usage

const Post = mongoose.model('Post', postSchema);
const Comment = mongoose.model('Comment', commentSchema);

// Models
});
  comments: [{ type: mongoose.Schema.Types.ObjectId, ref: 'Comment' }],
  createdAt: { type: Date, default: Date.now }
  content: { type: String, required: true },
  author: { type: String, required: true },
  title: { type: String, required: true, trim: true },
// Post Schema
const postSchema = new mongoose.Schema({

});
  createdAt: { type: Date, default: Date.now }
  post: { type: mongoose.Schema.Types.ObjectId, ref: 'Post', required: true },
  author: { type: String, required: true },
  text: { type: String, required: true },
const commentSchema = new mongoose.Schema({
// Comment Schema

  .catch(err => console.error("❌ MongoDB connection error:", err));
  .then(() => console.log("✅ Connected to MongoDB Atlas"))
mongoose.connect(uri)

// Connect to MongoDB Atlas
// MongoDB Atlas Connection String
const uri = "mongodb+srv://CampusPlacement:padala1326@cluster0.zufsvms.mongodb.net/?appName=Cluster0";
const mongoose = require('mongoose');

```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB66)