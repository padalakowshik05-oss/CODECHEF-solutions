      </button>
    </div>
  );
}

// Component to display the list of tasks
function TaskList({ tasks, removeTask}) {
  return (
    <ul style={{ listStyleType: "none", padding: 0}}>
      {tasks.map((task, index) => (
        
          
          </button>
        </li>
        <li key={index} style={{ margin: "10px 0"}}>
          {task}
          <button
            onClick={() => removeTask(index)}
            style={{ marginLeft: "10px", color: "red"}}
          >
            Remove
        Add
      <button onClick={handleAddClick} style={{ marginLeft: "5px" }}> 
      ))}
    </ul>
  );
      />
        placeholder="Enter a task..."


        onChange={(e) => setInputValue(e.target.value)}
        value={inputValue}
}
