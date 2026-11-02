}

// Step 5: Read All Students
async function readAllStudents() {
  try {
    const students = await Student.find({});
    console.log('📚 All Students:', students);
  } catch (error) {
    console.error('❌ Error reading students:', error);
  }
}

// Step 6: Read Student by ID (Optional)
async function readStudentById(id) {
  try {
    const student = await Student.findById(id);
    if (student) {
      console.log('🔍 Student Found by ID:', student);
    } else {
      console.log('⚠️ No student found with that ID');
    }
  } catch (error) {
    console.error('❌ Error finding student by ID:', error);
  }
}

// Step 7: Run Practice
async function runPractice() {
  await createStudent();
  await readAllStudents();

  // Uncomment this line to test reading by ID:
  // await readStudentById('REPLACE_WITH_ACTUAL_OBJECT_ID');