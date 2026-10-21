const Tab = ({ label, activeTab, setActiveTab }) => {
  const isActive = activeTab === label;

  return (
    <button
      onClick={() => setActiveTab(label)}
      style={{
        padding: '10px 20px',
        cursor: 'pointer',
        backgroundColor: isActive ? '#333' : '#f0f0f0',
        color: isActive ? '#ffffff' : '#000000',
        border: '1px solid #ccc',
        borderRadius: '4px',
        fontWeight: isActive ? 'bold' : 'normal'
      }}
    >
      {label}
    </button>
  );
};

export default Tab;

