    </div>
  );
      {children}
      <h2>User Section</h2>
    <div className="main-content">
  return (
// 2. Intermediate Layout Component (Doesn't use the props)
function MainContentArea({ children }) {
}

      </MainContentArea>
  );
      </cardWrapper>
          <p>{userData.bio}</p>
        </Card>
        >
          footerContent={<button>{userData.actionText} - {userData.name}</button>}
          headerContent={userData.name}
        <Card
      <cardWrapper>
    <MainContentArea>
  return (
  // Prop Drilling starts here

    bio: 'Curious explorer of digital rabbit holes.',
    actionText: 'View Profile',
  };
    name: 'Alice Wonderland',
  const userData = {
import './App.css'; // Make sure styles.css is in the same folder

// 1. Top-level Page Component (Holds the data)
function UserProfilePage() {