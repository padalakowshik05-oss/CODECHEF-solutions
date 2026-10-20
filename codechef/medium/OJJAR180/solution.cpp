import React, { useContext } from 'react';
import UserContext from '../UserContext';

function Greeting() {
  const user = useContext(UserContext);


  return (
    <div className="greeting">
      <h2>Welcome back, {user.name}!</h2>

      
    </div>
  );
}

      <p>We're glad to see you again. Enjoy your learning session!</p>
export default Greeting;