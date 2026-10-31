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