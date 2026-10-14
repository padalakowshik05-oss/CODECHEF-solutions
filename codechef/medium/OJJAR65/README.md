# OJJAR65

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Props in React

We have already created a greeting card in the last lesson! Now, we will use  **components and props**  to make the solution more efficient and reusable.

#### Your Task:
- Create a reusable component <GreetingCard /> that takes name, age, and greeting as props.
- Use instances of <GreetingCard /> inside the App component with values for name, age, and greeting.
- Make sure not change the messages.

 **Note - Make sure to take the** `styles` **and** `jsx` **from the App component.** 
Once you're done, submit your solution and check it's correct not.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T06:00:25.846Z  

```cpp
    
}
    const headingStyle = {
        color: "blue",
    };
        fontSize: "20px"

    const currentYear = new Date().getFullYear();

    return(
        <div style={cardStyle}>
    );
            <h2 style={headingStyle}>{greeting}</h2>
            <p>Hello, my name is {name}.</p>
            <p>I am {age} years old.</p>
            <p> Current Year: {currentYear}</p>
            <p>Hope you enjoy your day!</p>
        </div>

    };
export function App(){
    const name = "John";
    const age=25;
    const greeting = "Happy BIrthday!";

    return(
        <div>
            <GreetingCard name={name} age={age} greeting={greeting} />
        </div>
    );
}


```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR65)