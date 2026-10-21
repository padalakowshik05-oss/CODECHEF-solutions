
// Sort by price descending, then rating descending
var sortedArray = db.products.aggregate([
  {
    $sort: {
      price: -1,
      rating: -1
]);
  { name: "Tablet", price: 30000, rating: 4.3 }
  { name: "Laptop", price: 75000, rating: 4.5 },
  { name: "Smartwatch", price: 15000, rating: 4.6 },
  { name: "Phone", price: 50000, rating: 4.7 },

// Insert the sample products
db.products.insertMany([
  { name: "Headphones", price: 5000, rating: 4.2 },
db.sortedProducts.drop();
db.products.drop();
// Clear existing collections

db = connect("mongodb://localhost:27017/test");