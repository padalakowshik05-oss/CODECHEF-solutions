# POLMDB69

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Populating Author Details for a BlogPost

Alright, you've seen how Mongoose's `.populate()` method can bring related data together with the `Students` and `Courses` example. Now it's your turn to practice!

 **Your Goal:** 

You'll model `Authors` and `BlogPosts`. A `BlogPost` will have an `author` field that stores the ID of an `Author`. Your task is to:

- Define Mongoose schemas for Author and BlogPost.
- Create one sample author and one sample blog post written by this author.
- Fetch the blog post, first without populating the author details, and observe the output.
- Then, fetch the same blog post with populating the author details, and see how the author's information is now included.
#### Task:
- Write the 2 given below Schema.
- Author Schema (Author model): name: String bio: String
- BlogPost Schema (BlogPost model): title: String content: String author: Should store an ObjectId and use ref: 'Author' to link to the Author model.
- While printing add the code to populate the data.
#### Note:

When fetching with population, log the post's title, the fully populated `author` object, and specifically the author's name and bio from the populated data.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T15:20:37.970Z  

```cpp
    await BlogPost.deleteMany({});

  try {
    await Author.deleteMany({});
  console.log('\n--- Creating Sample Author and BlogPost ---');
async function createSampleData() {
// ✅ Step 4: Create sample data
const BlogPost = mongoose.model('BlogPost', blogPostSchema);

});
  }
    ref: 'Author'
    type: mongoose.Schema.Types.ObjectId,
  content: String,
  author: {
  title: String,
const blogPostSchema = new mongoose.Schema({
// ✅ Step 3: Define the BlogPost Schema

const Author = mongoose.model('Author', authorSchema);
});
  bio: String,
  name: String,
const authorSchema = new mongoose.Schema({
// ✅ Step 2: Define the Author Schema

  .then(() => console.log('✅ Connected to MongoDB Atlas'))
  .catch(err => console.error('❌ MongoDB connection error:', err));
const mongoose = require('mongoose');

// ✅ Step 1: Connect to MongoDB Atlas (Update URI with your credentials)
const uri = "mongodb+srv://CampusPlacement:padala1326@cluster0.zufsvms.mongodb.net/?appName=Cluster0";
mongoose.connect(uri)
```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB69)