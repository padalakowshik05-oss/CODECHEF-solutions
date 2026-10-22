    width: 100%;
    padding: 12px;
    background-color:  #28a745;
    /* Green for creation */
    color:  white;
    border: none;
    border-radius: 5px;
    font-size: 1.1em;
    cursor: pointer;
    transition: background-color 0.3s ease;
}

.blog-form button:disabled {
    background-color:  #cccccc;
    cursor: not-allowed;
}

.blog-form button:hover:not(:disabled) {
    background-color:  #218838;
}

.error-message {
    color:  #dc3545;
    margin-top: 15px;
    font-size: 0.9em;
    text-align: center;
}
}