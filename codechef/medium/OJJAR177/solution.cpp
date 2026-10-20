import React from 'react';
import './App.css';
function Text({ as: Component = 'p', children, className = '', ...otherProps }) {
    const baseClass = 'text';
    const modifierClass = typeof Component === 'string' ? `text--${Component}` : '';
    const finalClassName = [baseClass, modifierClass, className].filter(Boolean).join(' ');
 
  return (
    <Component
      className={finalClassName}
      {...otherProps}
    >
      {children}
    </Component>
  );
}

export default Text;