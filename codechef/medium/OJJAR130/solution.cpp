            {/* --- Modified navigation section --- */}

                            <label htmlFor="agreeTerms">
                                <input type="checkbox" id="agreeTerms" name="agreeTerms" checked={agreeTerms} onChange={(e) => setAgreeTerms(e.target.checked)} />
                                {' '}I confirm that the information provided is accurate and I agree to the company's terms and conditions.
                            </label>
                        </div>
                    </div>
                )}
            </div>
                            <h4>Confirmation *</h4>
                        <div className="form-section terms-section">
                        
                        </div>
                            <p><strong>Skills:</strong> {formData.skills || <em>Not Provided</em>} </p>
                            <p><strong>Years of Experience:</strong> {formData.yearsExperience || <em>Not Provided</em>} </p>
                            <p><strong>Company:</strong> {formData.company || <em>Not Provided</em>} </p>
                            <p><strong>Job Title:</strong> {formData.jobTitle || <em>Not Provided</em>} </p>
                            <h4>Experience & Skills</h4>
                        <div className="review-section">
                        </div>

                            <p><strong>Address:</strong> {formData.address || <em>Not Provided</em>} </p>
                            <p><strong>Phone:</strong> {formData.phone || <em>Not Provided</em>} </p>
                            <p><strong>Email:</strong> {formData.email || <em>Not Provided</em>} </p>
                            <p><strong>Full Name:</strong> {formData.fullName || <em>Not Provided</em>} </p>
                            <h4>Personal Information</h4>
                        <div className="review-section">
                        <p>Please check your details carefully before submitting.</p>
                        <h2>Review Your Application</h2>
                    <div>
                {activeTabIndex === 2 && (
                )}