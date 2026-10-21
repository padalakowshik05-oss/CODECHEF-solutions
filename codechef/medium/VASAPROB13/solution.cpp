        { name: "Smart-Watch", category: "Wearable", price: 20000 }
        ]);

        // --- TASK 2: Find "High-End Essentials" ---
        // Filter for Category (Laptop or Tablet) AND Price (> 40000)
        const highEndEssentials = db.inventory.find({
          category: { $in: ["Laptop", "Tablet"] },
            price: { $gt: 40000 }
            }).toArray();

            print("--- Marketing Team: High-End Essentials ---");
            if ( highEndEssentials &&  highEndEssentials.length  >  0 )  {
                printjson(highEndEssentials);
                }  else  {
                    print("No products matched the criteria.");
                    }