            {/* Actual form fields will go here later */}
            <p>Content for the personal info tab goes here.</p>
            <h2>Personal Information</h2>
          <div>
        {activeTabIndex === 0 && (
        {/* 4. Use activeTabIndex for conditional rendering */}
      <div className="tab-content">
      </div>

        </button>
          Review
        <button className={`tab-header ${activeTabIndex === 2 ? 'active' : ''}`}
        </button>
          Experience
        <button className={`tab-header ${activeTabIndex === 1 ? 'active' : ''}`}
        {/* 4. Use activeTabIndex for active class */}
        <button className={`tab-header ${activeTabIndex === 0 ? 'active' : ''}`}
          Personal Info
        </button>
      <div className="tab-headers">
    <div className="tabs-container">
  return (
  const isFirstTab = activeTabIndex === 0;
  const isLastTab = activeTabIndex === totalTabs - 1;

  // 4. Calculate boolean flags for button disabling

        onClick={() => onTabClick(0)}
        >
        onClick={() => onTabClick(1)}
        >
        onClick={() => onTabClick(2)}
        >