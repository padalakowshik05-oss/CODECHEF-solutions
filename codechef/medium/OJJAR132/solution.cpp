                            <p><strong>Email:</strong> {formData.email || <em>Not Provided</em>}</p>
                            <p><strong>Phone:</strong> {formData.phone || <em>Not Provided</em>}</p>
                            <p><strong>Address:</strong> {formData.address || <em>Not Provided</em>}</p>
                        </div>
                        <div className="review-section">
                            <h4>Experience & Skills</h4>
                            <p><strong>Job Title:</strong> {formData.jobTitle || <em>Not Provided</em>}</p>
                            <p><strong>Company:</strong> {formData.company || <em>Not Provided</em>}</p>
                            <p><strong>Years of Experience:</strong> {formData.yearsExperience}</p>
                            <p><strong>Skills:</strong> {formData.skills || <em>Not Provided</em>}</p>
                        </div>
                        <div className="form-section terms-section">
                            <h4>Confirmation *</h4>
                            <label htmlFor="agreeTerms">
                                <input
                                    type="checkbox"
                                    id="agreeTerms"
                                    name="agreeTerms"
                                    checked={agreeTerms}
                                    onChange={handleAgreeTermsChange}
                                />
                                {' '}I confirm that the information provided is accurate and I agree to the company's terms and conditions.
                            </label>
                            {formErrors.agreeTerms && <span className="error-message">{formErrors.agreeTerms}</span>}
                        </div>
                    </div>
                )}
            </div>
            <div className="tab-navigation">
                <button onClick={onPrevious} disabled={isFirstTab}>Previous</button>
                {isLastTab ? (
                    <button onClick={handleFormSubmit} className="submit-button">Submit Application</button>
                ) : (
                    // Ensure handleNextClick is used