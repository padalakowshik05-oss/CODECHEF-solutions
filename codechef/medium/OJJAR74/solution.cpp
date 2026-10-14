      {/* Shown if the user is logged in and is a premium user */}
      

       
      {/* Shown if the user is not logged in or not a premium user */}
    </>
  );
}

// App component: Manages state and renders the WelcomeMessage component
export default function App() {
  const isLoggedIn = true;  // Change these values to test different scenarios
  const isPremiumUser = false; // Change these values to test different scenarios

  return (
    <WelcomeMessage isLoggedIn={isLoggedIn} isPremiumUser={isPremiumUser} />
  );
}

      )}
      
        <p>Please log in and m=upgarde to premium...</p>
        <p>Welcome to premium Content! </p>
      ) : (
      {/* Conditional rendering: Show different messages based on user status  */}
      {isLoggedIn && isPremiumUser ? (

      {/* Application title  */}
      <h1>My React App</h1>
  return (
    <>
export function WelcomeMessage({ isLoggedIn, isPremiumUser }) {
// WelcomeMessage component: Displays a message based on login and premium status