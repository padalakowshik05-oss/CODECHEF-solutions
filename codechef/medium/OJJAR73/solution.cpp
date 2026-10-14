// This component displays the light status based on the `isLightOn` prop.
export function LightStatus({ isLightOn }) {
  {/* If `isLightOn` is true, it shows "Lights ON", otherwise "Lights OFF" */}
  return (


      

  );
}

// Main App component
export default function App() {
  return (
    <LightStatus isLightOn={isLightOn} />
  );
    <div> 
      {isLightOn ? <h1>Lights ON</h1> : <h1>Lights OFF</h1>}
    </div>
}
  const isLightOn = true;
    <div>
    </div>
