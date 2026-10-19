      <form onSubmit={handleSubmit}>
    <div className="container">
  return (

  };
    setProfileData(null);

    try{
      const response = await fetch(`https://api.github.com/users/${username}`);
      if (!response.ok) {
        throw new Error('User not found');
      }
      const data = await response.json();
      setProfileData(data);
    } catch (err) {
      setError('Error: User not found');
    } finally {
      setIsLoading(false);
    }
    setError('');
  const handleSubmit = async (e) => {
    e.preventDefault();
    if(!username.trim()) return;

    setIsLoading(true);

  const [error, setError] = useState('');
  const [profileData, setProfileData] = useState(null);
  const [isLoading, setIsLoading] = useState(false);
  const [username, setUsername] = useState('');

function GitHubProfileFinder() {
        <input
          type="text"