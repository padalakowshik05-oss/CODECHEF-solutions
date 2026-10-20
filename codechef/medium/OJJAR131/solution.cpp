    const handleInputChange = (e) => {
        const { name, value } = e.target;
        setFormData(prev => ({ ...prev, [name]: value }));
        
        if (formErrors[name]) {
            setFormErrors(prev => ({ ...prev, [name]: null }));
        }
    };

    const handleAgreeTermsChange = (e) => {
        const { checked } = e.target;
        setFormData(prev => ({ ...prev, agreeTerms: checked }));
        
        if (checked && formErrors.agreeTerms) {
            setFormErrors(prev => ({ ...prev, agreeTerms: null }));
        }
    };

    

   
   

    return (
        <div className="tabs-container">
            <div className="tab-headers">
                <button className={`tab-header ${activeTabIndex === 0 ? 'active' : ''}`} onClick={() => handleTabHeaderClick(0)}>1. Personal Info</button>

    const handleNextClick = () => {
        if (typeof onNext === 'function') {
    };
            onNext();
        }