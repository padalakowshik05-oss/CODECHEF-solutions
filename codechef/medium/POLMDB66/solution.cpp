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
