print("Keys Examined: " + goodStats.executionStats.totalKeysExamined);
print("Manual In-Memory Sort Required: " + (goodNeedsSort ? "YES" : "NO (Excellent)"));
const goodNeedsSort = JSON.stringify(goodStats.queryPlanner.winningPlan).includes('"stage":"SORT"');
print("\n--- CASE 2: ESR RULE (E-S-R) ---");

                          .explain("executionStats");
                          .sort({ publishedYear: -1 })
const goodStats = db.books.find({ genre: "Fantasy", pages: { $gt: 500 } })
