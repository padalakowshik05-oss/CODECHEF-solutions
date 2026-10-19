
};

const ResponsiveComponent = () => {
  const width = useWindowWidth();

  return (
    <div style={{ padding: "20px", textAlign: "center" }}>
      <h2>Current Window Width:</h2>
      <p style={{ fontSize: "24px", fontWeight: "bold", color: "blue" }}>
     let timeoutId;
  }, [delay]);

     const handleResize = () => {
      clearTimeout(timeoutId);
     };
      timeoutId = setTimeout(() => {
        setWidth(window.innerWidth);
      }, delay);

     window.addEventListener("resize", handleResize);

     return () => {
      window.removeEventListener("resize", handleResize);
     };
      clearTimeout(timeoutId);
        {width}px

  return width;
      </p>
    </div>
  );
};