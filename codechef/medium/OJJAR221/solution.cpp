// TASK 1: Import createPortal from react-dom
import { createPortal } from 'react-dom';
import './index.css';

// TASK 2: Get a reference to the <div id="toast-root"> DOM element
const toastRoot = document.getElementById('toast-root');

function Toast({ message }) {
  const toastContent = (
    <div className="toast-notification">
      <p>{message}</p>
    </div>
  );

  // TASK 3: Modify the Toast component's return statement to use createPortal
  return toastRoot ? createPortal(toastContent, toastRoot) : null;
}

export default Toast;