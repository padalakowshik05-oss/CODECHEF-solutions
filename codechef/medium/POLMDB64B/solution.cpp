      _id: 0
    }
  }
]).forEach(doc => printjson(doc));


print("Step 4: Match Result");

db.orders.aggregate([
  {
    $lookup: {
      from: "customers",
      localField: "customerId",
      foreignField: "_id",
      as: "customerDetails"
    }
  },
  {
    $unwind: "$customerDetails"
  },
  {
    $match: {