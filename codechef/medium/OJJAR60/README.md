# OJJAR60

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Dynamic Greeting Card

Update the given React component to display dynamic values and additional information inside the `<div>`.

- Show dynamic values: Add a <p> tag to display: <p>Hello, my name is {name}.</p> Add another <p> tag to show age: <p>I am {age} years old.</p>
- Display the current year dynamically: Use JavaScript inside JSX to show the year: <p>Year: {new Date().getFullYear()}</p>
- Add a final message: Insert this at the end: <p>Enjoy your day! 🎉</p>

By following these instructions, you will create a structured and dynamic greeting card in React! 🚀

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T05:33:55.711Z  

```cpp
        boxShadow: "2px 2px 10px rgba(0,0,0,0.1)"
    }; 

    const headingStyle = {
        color: "blue",
        fontSize: "20px"
    };

    return (  
        <div style={cardStyle}>
            {/* Greeting message */}
            <h2 style={headingStyle}>{greeting}</h2>  

            {/* Displaying dynamic values */}
            <p>Hello, my name is {name}.</p>
            <p>I am {age} years old.</p>

            

        textAlign: "center",
        width: "250px",
        borderRadius: "10px", 
            {/* Expression slot example - current year */}
            <p>Current Year: {currentYear}</p>

            {/* Ensuring proper JSX spacing */}
            <p>Hope you enjoy your Day! </p>

        </div>  
    );  
}
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR60)