# PREACT018

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task

In this task, you will create a  **Profile Card**  component using React. This will involve  **JSX, React components, props, and basic CSS styling**.

#### 1. Create a ProfileCard Component
- This component should receive the following props: name → The person’s name bio → A short description about the person avatarUrl → URL of the person's profile image
- Inside the component, display these props properly using JSX.
#### 2. Use the ProfileCard Component inside App.js
- Inside the App component, render the ProfileCard component.
- Pass appropriate values for name, bio, and avatarUrl (make sure name, bio, avatarUrl not be null).

your final project should be like this

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T16:22:25.641Z  

```cpp
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
```

---

[View on CodeChef](https://www.codechef.com/problems/PREACT018)