        className={`input-field ${isFocused ? 'input-focused' : ''}`}
        placeholder="Click buttons to focus/blur"
        ref={inputRef}
      />
      
      <div className="button-group">
        <button className="action-button" onClick={handleFocus}>
          Focus Input
        </button>
        <button className="action-button" onClick={handleBlur}>
      <input
        type="text"
    <div className="container">
  return (

  };
    setIsFocused(false);
    
  const handleBlur = () => {

  };
    setIsFocused(true);
    inputRef.current.focus();
    inputRef.current.blur();
    
  const handleFocus = () => {
  const inputRef = useRef(null);

  const [isFocused, setIsFocused] = useState(false);
function FocusManager() {

import './App.css';
import { useState, useRef } from 'react';