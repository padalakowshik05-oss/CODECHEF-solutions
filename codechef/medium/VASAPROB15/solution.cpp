    { title: "Mastering Aggregation", author: "Bob", views: 450 },
      { title: "Indexes Explained", author: "Charlie", views: 300 },
        { title: "Schema Design", author: "Daisy", views: 280 },
          { title: "Transactions in MongoDB", author: "Eve", views: 600 },
            { title: "Sharding Deep Dive", author: "Frank", views: 150 }
            ]);

            // Aggregation pipeline
            var pagedb = db.articles.aggregate([
              { $skip: 2 },
                { $limit: 3 }
                ]).toArray();

                db.paginatedArticles.insertMany(pagedb);

                printjson(db.paginatedArticles.find().toArray());
