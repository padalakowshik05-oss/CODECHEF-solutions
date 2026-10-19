    <div className="profile-container">
  return (

  };
    // Clear the input field after updating
    
    // Update only the city while keeping the country unchanged
    }
      setCityInput("");
      }));
        }
          city: cityInput
          ...prevUser.address,
        address: {
        ...prevUser,
      setUser((prevUser) => ({
    if (cityInput.trim() !== ""){
  const updateCity = () => {
  // Update the function to update the city in the user.address state

      setAgeInput("");
    }
  };
      }));
        age: parsedAge
        ...prevUser,
      setUser((prevUser) => ({
    if (!isNaN(parsedAge) && ageInput.trim() !== ""){
    const parsedAge = Number(ageInput);
  const updateAge = () => {
  // Update the function to update the age in the user state

  };
    // Clear the input field after updating