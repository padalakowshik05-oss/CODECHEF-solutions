            <input
              defaultValue={guest.name}
              className="guest-input"
            />
            <button
              className="remove-btn"
              onClick={() => handleRemove(guest.id)}
            >
              Remove
            </button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;

    <div className="container">
      <h1>Guest List</h1>
      <ul className="guest-list">
        {guests.map((guest) => (
          <li key={guest.id} className="guest-item">
  return (

  };
    setGuests(guests.filter(guest => guest.id !== id));
  const handleRemove = (id) => {
