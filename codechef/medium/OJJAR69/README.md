# OJJAR69

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### GreetingCard Component

Create personalized greeting cards that show each person's name, age, greeting message, and  **favorite color**  using React components.

 **Steps to Follow:** 

- Show Favorite Color in Greeting Card Modify the GreetingCard component to display the person's favorite color in a new paragraph (<p> tag) below their age. Use the existing favoriteColor prop to display this information. Example format: <p> My favorite color is {favoriteColor}.</p>
- Render Cards for All People In the App component, display a GreetingCard for every person in the people array. Pass all required information (name, age, greeting message, favorite color) as props to each card. Use the map() method to loop through the people array.

 **At the end your app should look like this**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T06:17:40.812Z  

```cpp
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
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR69)