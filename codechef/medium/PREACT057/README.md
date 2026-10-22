# PREACT057

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
**Submitted:** 2026-10-22T09:15:10.994Z  

```cpp
    window.addEventListener('resize', watchWidth);

    return function () {
      window.removeEventListener('resize', watchWidth);
    };
  }, []);

  return (
    <div>
      <p>Window Height: {windowSize.height}px</p>
      <p>Window Width: {windowSize.width}px</p>
    </div>
  );
}

export default function App() {
  const [showTracker, setShowTracker] = useState(true);

    }
      });
        height: window.innerHeight
  });

  useEffect(() => {
    function watchWidth() {
      setWindowSize({
        width: window.innerWidth,
    height: window.innerHeight
import React, { useState, useEffect } from 'react';

function WindowTracker() {
  const [windowSize, setWindowSize] = useState({
    width: window.innerWidth,
```

---

[View on CodeChef](https://www.codechef.com/problems/PREACT057)