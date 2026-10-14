    
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

