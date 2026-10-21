# OJJAR148

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Build React Travel Guide With Lazy Loading

You are building a Travel Guide app in React. The app has the following pages:

🏠 Home – Welcomes the user. 🌍 Destinations – Shows a list of travel destinations. 📖 About – Tells about the travel guide company. 📞 Contact – Shows contact info.

 **Tasks** 

- To optimize the app by implementing Lazy Loading for these pages(Complete App.jsx).
- Style the Heading - Apply the following styles to the # (Complete Home.jsx) Font size: 36px Font weight: bold Color: #2c3e50 Margin-bottom: 20px
- Style the Paragraph - Apply the following styles to the (Complete Home.jsx) Font size: 18px Color: #555
- Add a Background - Add a background color #f0f0f0 to the body(Complete Home.jsx).

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T12:32:40.499Z  

```cpp
import React, { lazy, Suspense } from "react";
import { Routes, Route } from "react-router-dom";
import Navbar from "./components/Navbar";

// Lazy imports
const Home = lazy(() => import("./pages/Home"));
const Destinations = lazy(() => import("./pages/Destinations"));
const About = lazy(() => import("./pages/About"));
const Contact = lazy(() => import("./pages/Contact"));

export default function App() {
  return (
    <div className="app">
      <Navbar />
      <div className="content">
        {/* Wrap routes inside Suspense to handle fallback */}
        <Suspense fallback={<div>Loading...</div>}>
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/destinations" element={<Destinations />} />
            <Route path="/about" element={<About />} />
            <Route path="/contact" element={<Contact />} />
          </Routes>
        </Suspense>
      </div>
    </div>
  );
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR148)