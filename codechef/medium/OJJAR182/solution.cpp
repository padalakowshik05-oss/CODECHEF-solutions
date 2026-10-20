import { UserContext } from "../context/UserContext";

const Modal = () => {
  // Access context values needed for this component
  const { user, setIsModalOpen } = useContext(UserContext);

  return (
    <div className="modal-overlay">
      <div className="modal">
        {/* Display personalized welcome message */}
        <h2>👋 Hello, {user.name}!</h2>
        <p>Welcome to the app. We're glad you're here!</p>
        
        {/* Button to close modal by updating context state */}
        <button onClick={() => setIsModalOpen(false)} className="close-button">
          Close
        </button>
      </div>
    </div>
  );
};

export default Modal;
import React, { useContext } from "react";