    });
      console.error("Promise → Error fetching user data:", error);
    .catch(error => {
    })
      console.log("Promise → User data:", userData);
    .then(userData => {
  fetchUserData()
// 2. Promise .then/.catch version
function getUserDataPromise() {

}
  }
    console.error("Async/Await → Error fetching user data:", error);
  } catch (error) {
    console.log("Async/Await → User data:", userData);
    const userData = await fetchUserData();
  try {
        resolve({ id: 123, name: "John Doe" });
      } else {
        reject("Failed to fetch user data.");
      }
    }, 50);
  });
}

// 1. Async/Await version
async function getUserDataAsyncAwait() {
      if (success) {
      const success = Math.random() > 0.5;
    setTimeout(() => {
  return new Promise((resolve, reject) => {
async function fetchUserData() {
// Simulated API function using Promises