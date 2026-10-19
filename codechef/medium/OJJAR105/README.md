# OJJAR105

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Cleanup in React
#### Task: Window Size Tracker

Create a component that displays and updates the window size when the user resizes the browser. Follow these steps:

- Display Initial Size: Show the current window width and height when the component loads.
- Update on Resize: Automatically update the displayed size when the window is resized.

A toggle button is provided to show/hide your component. (Write code in the  **`WindowTracker`**  component where indicated)

 **Hint:**  Use  **`window.addEventListener('resize',...)`** .

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T13:11:59.430Z  

```cpp
  }, []);




    

    };
      window.removeEventListener('resize', handleResize);
    return () => {

    window.addEventListener('resize', handleResize);

    }



      });
        height: window.innerHeight
        width: window.innerWidth,
      setWindowSize({
    function handleResize() {
    // Modify resize event listener function here
  useEffect(() => {
  // complete the useEffect hook here
  
  });
    height: window.innerHeight
    width: window.innerWidth,
  const [windowSize, setWindowSize] = useState({
function WindowTracker() {
import React, { useState, useEffect } from 'react';

```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR105)