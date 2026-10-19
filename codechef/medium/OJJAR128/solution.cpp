                            </label>
                        </div>

                        
                    </div>
                )}
            </div>

            <div className="tab-navigation">
                {isLastTab ? (
                    <button className="submit-button" onClick={handleFormSubmit}>
                        Submit Application
                    </button>
                )}
            </div>
        </div>
    );
}
                <button onClick={onPrevious} disabled={isFirstTab}>
                    Previous
                </button>
                ) : (
                    <button onClick={onNext}>
                        Next
                    </button>

export default Tabs;