# NIPFVX08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Connect Express App to MyTasksDB

Alright, you've just learned how to use Mongoose to connect your Node.js application to MongoDB! Now, let's solidify that understanding with a practical example.

#### What this code does:
- Attempt to connect to a MongoDB Atlas database named MyTasksDB.
- Log a success message to the console if the MongoDB connection is established.
- Log an error message to the console if the connection fails.

 **Let's walk through building the solution step-by-step:** 

- Define the MongoDB Atlas Connection URI: This string tells Mongoose where your cloud database is hosted and what it's called. Replace the <username>, <password>, and <cluster> placeholders with your real MongoDB Atlas credentials. const mongoURI = 'mongodb+srv://<username>:<password>@<cluster>.mongodb.net/MyTasksDB?retryWrites=true&w=majority';
- Connect to MongoDB Atlas using Mongoose: This is the core part. We use mongoose.connect() which returns a Promise. We'll use.then() for success and.catch() for errors.

```
mongoose.connect(mongoURI)
 .then(() => {
    console.log('✅ Connected to MongoDB Atlas');
  })
 .catch((err) => {
    console.error('❌ MongoDB connection error:', err);
  });

```

#### Task:

Complete the `mongoURI` with your own MongoDB atlas connection string to connect with the database.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T15:22:03.372Z  

```cpp
const mongoose = require('mongoose');

// MongoDB Atlas Connection String
const uri = "mongodb+srv://CampusPlacement:padala1326@cluster0.zufsvms.mongodb.net/&appName=Cluster0";

// Connect to MongoDB Atlas
mongoose.connect(uri, {
  useNewUrlParser: true,
    useUnifiedTopology: true,
    })
      .then(() => console.log('✅ Connected to MongoDB Atlas'))
        .catch(err => console.error('❌ MongoDB connection error:', err));

        // 1. Define the Author Schema & Model
        const authorSchema = new mongoose.Schema({
          name: String,
            bio: String
            });

            const Author = mongoose.model("Author", authorSchema);

            // 2. Define the BlogPost Schema & Model
            const blogPostSchema = new mongoose.Schema({
              title: String,
                content: String,
                  author: {
                      type: mongoose.Schema.Types.ObjectId,
                          ref: "Author"
                            }
                            });

                            const BlogPost = mongoose.model("BlogPost", blogPostSchema);

```

---

[View on CodeChef](https://www.codechef.com/problems/NIPFVX08)