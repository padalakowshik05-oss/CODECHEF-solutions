# VASAPROB15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### skip and limit - Practice Problem

You are given a collection of  **articles**. Each article has a `title`, `author`, and `views`.

Write an  **aggregation pipeline**  to implement pagination:

- Skip the first 2 documents.
- Limit the result to 3 documents.

Finally, store the paginated results into a new collection called  **paginatedArticles**.

 **Expected Output** 

You should get the following documents:

```
[
  { "_id": ObjectId("..."), "title": "Indexes Explained", "author": "Charlie", "views": 300 },
  { "_id": ObjectId("..."), "title": "Schema Design", "author": "Daisy", "views": 280 },
  { "_id": ObjectId("..."), "title": "Transactions in MongoDB", "author": "Eve", "views": 600 }
]

```

And these will also be stored in the  **paginatedArticles**  collection.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T16:52:06.514Z  

```cpp
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

```

---

[View on CodeChef](https://www.codechef.com/problems/VASAPROB15)