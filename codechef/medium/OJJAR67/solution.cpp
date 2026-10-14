  const avatarUrl = "https://cdn.codechef.com/images/problems/PREACT018/a29545c678c75e59bc684868407b1d13.webp";

  // update the user name and bio
  const name = "John Doe";
  const bio = "Frontend developer and React enthusiast.";

  return (
    <div>

      <h1 style={{ textAlign: "center", fontFamily: "Arial, sans-serif" }}>
        User Profile
      </h1>
      <ProfileCard name={name} bio={bio} avatarUrl={avatarUrl} />
      {/* Render the ProfileCard component with user details */}




    </div>
  );
};

const App = () => {
// Update the App component - Renders the ProfileCard component

};
  );
    </div>
      <p>{bio}</p>

      <h2>{name}</h2>

      <img src={avatarUrl} alt={`${name}'s avatar`} style={imageStyle} />