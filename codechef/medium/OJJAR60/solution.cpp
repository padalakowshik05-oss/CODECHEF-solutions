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