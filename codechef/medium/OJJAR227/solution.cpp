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