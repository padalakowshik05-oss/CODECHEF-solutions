# OJJAR227

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Countdown Begins!

You're provided with a partially implemented `CountdownTimer` component. Your task is to complete the countdown logic using  **React hooks**  so that the timer behaves correctly when users interact with it.

This challenge is perfect for reinforcing your understanding of:

- useState for managing state
- useEffect for side effects and intervals
- Controlled user interaction (start, pause, reset)

 **Your Tasks** 

Complete the `CountdownTimer` component so that it:

- Starts counting down every second when isRunning is true.
- Pauses the countdown when isRunning becomes false.
- Stops automatically at 0 seconds, and sets isRunning to false.
- Cleans up the interval when the component is unmounted or paused to avoid memory leaks.

 **Example** 

 **Learning Resources** 

- React Docs – useEffect https://reactjs.org/docs/hooks-effect.html
- React Docs – useState https://reactjs.org/docs/hooks-state.html
- MDN – setInterval() https://developer.mozilla.org/en-US/docs/Web/API/setInterval

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T12:59:33.614Z  

```cpp
      interval = setInterval(() => {
        setTimeLeft(prevTime => prevTime - 1);
      }, 1000);
    } else if (timeLeft === 0) {
      setIsRunning(false);
    }

    // Cleanup interval on unmount or when dependencies change (pause/stop)
    return () => clearInterval(interval);
  }, [isRunning, timeLeft]);

  return (
    <div className="timer">
      <h2>Time Left: {timeLeft}s</h2>
      <TimerControls
        isRunning={isRunning}
        onStart={() => setIsRunning(true)}
        onPause={() => setIsRunning(false)}
        onReset={() => {
          setIsRunning(false);
          setTimeLeft(10);
        }}

    if (isRunning && timeLeft > 0) {
    let interval;
  useEffect(() => {

  const [isRunning, setIsRunning] = useState(false);
  const [timeLeft, setTimeLeft] = useState(10);
function CountdownTimer() {
import TimerControls from './TimerControls';

import { useState, useEffect } from 'react';
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR227)