    'The Godfather',
    'Goodfellas',
    'The Social Network',
    'Whiplash',
    'Mad Max: Fury Road',
    'The Grand Budapest Hotel',
    'Her',
    'Eternal Sunshine of the Spotless Mind',
    'No Country for Old Men',
    'There Will Be Blood'
  ];

  // update this hook 
  useEffect(() => {
    const debounceTimer = setTimeout(() => {

    

    }, 500);
      const filtered = movies.filter(movie => 
        movie.toLowerCase().includes(searchQuery.toLowerCase())
      );
      setFilteredMovies(filtered);

    return () => {
      clearTimeout(debounceTimer);
    };
  }, [searchQuery]);

  return (
    <div className="movie-search-container">
      <input
        className="search-input"
        type="text"