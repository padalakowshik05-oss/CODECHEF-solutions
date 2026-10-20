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