
             


export default App;
               
              
  }
    );
      </div>
        )}
          </ul>
              // set the className of todo-item here
            ))}
              </li>
                onChange={() => toggleComplete(todo.id)}
                />
                <span>{todo.text}</span>
                checked={todo.completed}
                type="checkbox"
              <input
            <li key={todo.id} className={`todo-item ${todo.completed ? 'completed' : ''}`}>
           {todos.map(todo => (
          <ul>
        ) : (
          <p className="empty-message">No todos</p>
          // Message shown when there are no todos
        {todos.length === 0 ? (
      
      {/* Display the list of todos */}