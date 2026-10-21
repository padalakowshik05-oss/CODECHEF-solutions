      </div>

      <div className="events-list">
        {events.map(event => (
          <div key={event.eventId} className="event-card">
            <h3>{event.eventId}</h3>
            <p>Date: {event.date}</p>
            {event.metadata?.notes && <p>Notes: {event.metadata.notes}</p>}
            {event.metadata?.invitees && (
              <div>
                <h4>Invitees:</h4>
                <ul>
                  {event.metadata.invitees.map(invitee => (
                    <li key={invitee.email}>
                      {invitee.name} ({invitee.email})
                    </li>
                  ))}
                </ul>
              </div>
            )}
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;