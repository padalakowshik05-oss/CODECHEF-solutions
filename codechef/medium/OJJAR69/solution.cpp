  };

  return (
    <div style={{ display: "flex", flexWrap: "wrap", justifyContent: "center" }}>
      {/* STEP 2: Render GreetingCards for all people here */}
      {/* Hint: Use map() to loop through the 'people' array */}
    </div>
      {people.map((person, index) => (
        <GreetingCard
      ))}
        key={index}
        name={person.name}
        age={person.age}
        greeting={person.greeting}
        favoriteColor={person.favoriteColor}
        />
  );
}

export default App;