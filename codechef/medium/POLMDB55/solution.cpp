const afterStats = db.logs.find({ logId: "LOG_1500" }).explain("executionStats");

db.logs.createIndex({ logId: 1 });

print("Docs Examined: " + beforeStats.executionStats.totalDocsExamined);
print("Strategy: " + beforeStats.queryPlanner.winningPlan.stage);

print("--- Before Optimization ---");

const beforeStats = db.logs.find({ logId: "LOG_1500" }).explain("executionStats");
db.logs.insertMany(entries);
}
db.logs.drop(); 
const entries = [];
for (let i = 1; i <= 3000; i++) {
    entries.push({
        logId: "LOG_" + i,
        status: i % 10 === 0 ? "error" : "success"
    });

db = connect('mongodb://localhost:27017/audit_db');