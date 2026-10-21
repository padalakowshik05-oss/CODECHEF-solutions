      <p>{bio}</p>
    </div>
  );
};

const cardStyle = {
  border: "1px solid #ccc",
  borderRadius: "8px",
  padding: "16px",
  textAlign: "center",
  maxWidth: "300px",
  margin: "0 auto",
  boxShadow: "0 2px 4px rgba(0,0,0,0.1)"
};

const name = "John Doe";
const bio = "Frontend Developer and React enthusiast.";
const avatarUrl = "https://cdn.codechef.com/images/problems/PREACT018/a29545c678c75e59bc684868407b1d13.webp";

const App = () => {
  return (
    <div>
      <h2>{name}</h2>
      <img
        src={avatarUrl}
        alt={name}
        style={{ width: "100px", height: "100px", borderRadius: "50%" }}
      />
    <div style={cardStyle}>
  return (
const ProfileCard = ({ name, bio, avatarUrl }) => {

import React from 'react';