# OJJAR210

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### React Counter App

We're working on a  **React counter app**  that should display a small animated "fling" message (like `+5`) every time the user clicks the increment button.

 **Application should be working like this** 

However, the current implementation isn’t working as expected. You’re already familiar with the concept — now it’s time to fix the behavior.

#### What You Need to Do
- Ensure the fling message shows every time the user clicks an increment button — even if the same button is clicked quickly multiple times! Solution Hint: Use the key property to help React re-render the element.
- Ensure the fling message doesn't show on initial render, but only when the count is incremented.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T15:05:42.361Z  

```cpp
  };
    }, 1200); 

    console.log(`Incrementing by ${amount}. New count: ${count + amount}. Showing message: "${message}"`);
      setFlingMessage(''); // Clear the message
      flingTimeoutRef.current = null; // Reset the ref
    flingTimeoutRef.current = setTimeout(() => {
    // 4. Set a new timeout to clear the message after a delay
    }

      clearTimeout(flingTimeoutRef.current);
    if (flingTimeoutRef.current) {
    // 3. Clear any existing timeout to prevent premature message clearing

    setKeyIndex(prev => prev + 1);
    setFlingMessage(message);
    // 2. Set the fling message to make it appear

    setCount(prevCount => prevCount + amount);
    // 1. Update the count state

    const message = `+${amount}`;
  // Handler function to increment the count and show the fling message
  const handleIncrement = (amount) => {

  const flingTimeoutRef = useRef(null); // Ref to store the timeout ID
  const [keyIndex, setKeyIndex] = useState(0); // State for the temporary message
  const [flingMessage, setFlingMessage] = useState('');
  const [count, setCount] = useState(0); // State for the counter

function App() {
import styles from './styles.module.css'; // Import CSS module
import { useState, useRef, useEffect } from 'react';
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR210)