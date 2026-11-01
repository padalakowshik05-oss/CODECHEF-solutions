                            return (
                                <div>
                                      <h1>Mouse Tracker</h1>
                                            <MouseTracker />
                                                </div>
                                                  );
                                                  }

                          export default function App() {
                          }
                          return <div>Cursor at ({position.x}, {position.y})</div>;

                  };

                      window.addEventListener("mousemove", handleMove);
                        }, []);
              setPosition({ x: e.clientX, y: e.clientY });
        const handleMove = (e) => {
    useEffect(() => {

  const [position, setPosition] = useState({ x: 0, y: 0 });
function MouseTracker() {