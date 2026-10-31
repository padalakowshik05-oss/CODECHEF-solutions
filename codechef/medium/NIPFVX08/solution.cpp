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
