export function DiscountMessage({ isPremiumMember }) {
  if (isPremiumMember) {
    return <p>You get a 20% discount!</p>;
  } else {
    return <p>Sign up for premium to unlock discounts!</p>;
  }
}

function App() {
  const isPremiumMember = true;
  return (
    <div>
      <DiscountMessage isPremiumMember={isPremiumMember} />
    </div>
  );
}

export default App;

