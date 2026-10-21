  { name: "Pen",        category: "Stationery",  price: 5,    inStock: true }
]);

const result = db.products.aggregate([
    {
        $match: {
              category: "Electronics",
                    inStock: true,
                          price: { $gt: 100 }
                              }
                                }
                                ]).toArray();



db.filteredProducts.insertMany(result);

printjson(db.filteredProducts.find().toArray());