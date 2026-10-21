const uri = 'mongodb+srv://CampusPlacement:sylesh@cluster0.zufsvms.mongodb.net/MyTasksDB?retryWrites=true&w=majority';

// Connect to MongoDB Atlas
mongoose.connect(uri)
  .then(() => {
      console.log('Connected to MongoDB Atlas');

          // Define the product schema
              const productSchema = new mongoose.Schema({
                    productName: String,
                          price: Number,
                                stockQuantity: Number,
                                      category: String
                                          });

                                              // Create the Product model
                                                  const Product = mongoose.model('Product', productSchema);

                                                      // Print verification messages
                                                          console.log('Product Model Created Successfully!');
                                                              console.log('Model Name:', Product.modelName);
                                                                  console.log('Schema Fields:', Object.keys(productSchema.paths));

                                                                      // mongoose.connection.close();
                                                                        })
                                                                          .catch((err) => {
                                                                              console.error('MongoDB connection error:', err);
                                                                                });

// MongoDB Atlas Connection URI

const mongoose = require('mongoose');
// productApp.js