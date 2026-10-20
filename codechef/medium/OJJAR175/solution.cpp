import React from "react";

const InputWithLabel = React.forwardRef(({ label, ...props }, ref) => {
  return (
    <div className="input-group">
      <label>{label}</label>
      <input ref={ref} {...props} />
    </div>
  );
});

import './App.css';
export default InputWithLabel;