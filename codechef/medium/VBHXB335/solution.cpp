        localStorage.removeItem('user');

        delete API.defaults.headers.common['Authorization'];

        setUser(null);
    };

    // Show loading while restoring the session
    if (loading) {
        return (
            <div className="container">
                Loading user session...
            </div>
        );
    }

    return (
        <AuthContext.Provider
            value={{ user, register, login, logout }}
        >
            {children}
        </AuthContext.Provider>
    );
};

// Custom hook to access authentication
export const useAuth = () => useContext(AuthContext);
