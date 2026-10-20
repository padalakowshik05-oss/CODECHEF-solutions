import React from 'react';
  const Tag = typeof href === 'string' ? 'a' : 'button';

  return (
    <Tag
      href={href}
      {...props}
    >
      {children}
    </Tag>
  );
}

export default LinkButton;

function LinkButton({ href, children, ...props }) {
import './App.css';
