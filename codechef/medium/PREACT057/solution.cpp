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