# POLMDB64B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Order & Customer Data Integration

Work with  **multiple collections**  and perform:

- $lookup → Join collections
- $unwind → Flatten joined arrays

 **Step 1: `$lookup` – Join Collections** 

- Join orders with customers
- Match: orders.customerId with customers._id
- Store result in a new field (e.g., customerDetails)

 **Step 2: `$unwind` – Flatten Data** 

- Convert the customerDetails array into a single object
- Use $unwind on joined field

 **Step 3: `$project` – Clean Output** 

- Display only: orderId product amount Customer name city
- Exclude _id

 **Step 4: `$match` – Filter Joined Data** 

- After joining, filter: Only orders where city = "Bangalore"

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T04:36:30.104Z  

```cpp
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
```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB64B)