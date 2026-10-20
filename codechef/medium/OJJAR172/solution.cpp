  return (
    <div className="app-container">
      {/* --- Added Form Element --- */}
      <form onSubmit={handleSubmit} className="form-wrapper">
        <CustomInput
          label="Email"         
          type="email"          
          value={email}         
          required              
          maxLength={50}       
          placeholder="Enter your email" 
          onChange={(e) => setEmail(e.target.value)}
        />
        {/* --- Added Submit Button --- */}
        <button type="submit" className="submit-button">
          Submit
        </button>
      </form>
    </div>
  );
}

export default App;

  };
    alert(`Form submitted! Email: ${email}`); // Simple feedback for the user
    // You can add logic here to send the data to an API, etc.