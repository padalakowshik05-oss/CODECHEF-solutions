        };

        fetchMyBlogs();
    }, []);

    if (loading) return <div>Loading your blogs...</div>;
    if (error) return <div>Error: {error}</div>;

    return (
        <div className="my-blogs-page">
            <h2>My Blogs</h2>
            {blogs.length === 0 ? (
                <div>
                    <p>You haven't created any blogs yet. Create one now!</p>
                    <Link to="/create">Create Blog</Link>
                </div>
            ) : (
                <div className="blog-list">
                    {blogs.map((blog) => (
                        <BlogCard key={blog._id} blog={blog} />
                    ))}
                </div>
            )}
        </div>
    );
};

export default MyBlogs;