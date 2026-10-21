import { createPortal } from 'react-dom'; // Import from react-dom!

// Find the portal target DOM node (outside the component rendering lifecycle)
const modalRootElement = document.getElementById('modal-root');

function Modal({ children, onClose, title }) {
  // The JSX structure for the modal's visual appearance
  const modalContent = (
    <div className="modal-backdrop" onClick={onClose}> {/* Backdrop closes modal */}
      {/* Dialog container: stopPropagation prevents clicks inside from closing */}
      <div className="modal-dialog" onClick={(e) => e.stopPropagation()}>
        <div className="modal-header">
          <h2>{title}</h2>
          <button onClick={onClose} className="modal-close-button" aria-label="Close modal">
            × {/* Simple 'X' button */}
          </button>
        </div>
        <div className="modal-body">
          {children}
        </div>
      </div>
    </div>
  );

  // Use createPortal to render the modalContent into the modalRootElement
  // If modalRootElement doesn't exist, it won't render (graceful degradation)
  if (!modalRootElement) {
      console.error("Modal root element #modal-root not found in the DOM.");
      return null; // Or render an inline fallback if preferred
  }

  return createPortal(modalContent, modalRootElement);
}