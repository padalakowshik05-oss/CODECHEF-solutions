
                            {/* --- TODO: Display Address state value here --- */}
                            <p><strong>Address:</strong> {address || 'Not Provided'}</p>
                        </div>
                        <div className="review-section">
                            <h4>Experience & Skills</h4>

                            {/* --- TODO: Display jobTitle state value here --- */}
                            <p><strong>Job Title:</strong> {jobTitle || 'Not Provided'}</p>
                            
                            {/* --- TODO: Display company state value here --- */}
                            <p><strong>Company:</strong> {company || 'Not Provided'} </p>

                            {/* --- TODO: Display yearsExperience state value here --- */}
                            <p><strong>Years of Experience:</strong> {yearsExperience || 'Not Provided'} </p>

                            {/* --- TODO: Display skills state value here --- */}
                            <p><strong>Skills:</strong> {skills || 'Not Provided'} </p>
                        </div>

                        <div className="form-section terms-section">
                            <h4>Confirmation *</h4>
                            <label htmlFor="agreeTerms">
                                <input
                                    type="checkbox" id="agreeTerms" name="agreeTerms" checked={agreeTerms} onChange={handleAgreeTermsChange}
                                    // --- TODO: Connect checked and onChange for agreeTerms ---
                                />
                                {' '}I confirm that the information provided is accurate and I agree to the company's terms and conditions.
                            </label>
                        </div>
                    </div>
                )}
            </div>