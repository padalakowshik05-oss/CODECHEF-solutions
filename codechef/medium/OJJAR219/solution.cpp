    <div className="profile-editor">
      <h2>Edit Your Profile</h2>

      address: { ...prevUser.address, [name]: value }
    }));
  };

  return (
      ...prevUser,
    setUser((prevUser) => ({
    const { name, value } = e.target;
  const handleAddressChange = (e) => {
  // Handler for nested address inputs (street, city)
  };

    setUser((prevUser) => ({ ...prevUser, [name]: value }));
  const handleInputChange = (e) => {
    const { name, value } = e.target;
  // Handler for top-level inputs (name, email)

  });
    }
    email: 'alice@example.com',
    address: {
      street: '123 Imagination Lane',
      city: 'Storybook City'
  const [user, setUser] = useState({
    name: 'Alice Wonderland',
  // Initial state with nested address structure
export default function ProfileEditor() {
import './App.css';

import { useState } from 'react';