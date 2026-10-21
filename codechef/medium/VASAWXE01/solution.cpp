db = connect('mongodb://localhost:27017/college_db');

// TASK 1: Create the 'students' collection
db.createCollection('students');

// TASK 2: Create the 'courses' collection
db.createCollection('courses');

// TASK 3: Drop the 'courses' collection
db.courses.drop();

// TASK 4: Drop the current database.
db.dropDatabase();

// Print the required success message
print("Database operations completed successfully.");