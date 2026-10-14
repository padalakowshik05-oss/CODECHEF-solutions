  // If the user is a premium member, show the discount message
  if (isPremiumMember) {


  // If the user is not a premium member, show a message encouraging them to sign up
  

  
}

function App() {
  const isPremiumMember = true; 

  return (
    <div>
      <DiscountMessage isPremiumMember={isPremiumMember} />
    </div>
  );
}

    return <p>You get a 20% discount!</p>;
  }else{
    return <p> Sign up for premium to unlocj=k discounts!</p>;
  }
export default App; // Export the App component as default

  
export function DiscountMessage({ isPremiumMember }) {
// Export a function component named DiscountMessage that takes a prop 'isPremiumMember'