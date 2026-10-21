        _id: 'blog3',
        title: 'JavaScript Async/Await Explained',
        content: 'Demystifying asynchronous JavaScript with async/await. Write cleaner, more readable async code and avoid callback hell. Understand how promises, async functions, and the await keyword work together to simplify complex operations.',
        author: 'Charlie Chaplin',
        createdAt: new Date(Date.now() - 86400000 * 1).toISOString() // 1 day ago
    }
];

const Home = () => {
    const [blogs, setBlogs] = useState(initialBlogsData);

    return (
        <div className="container">
    {
    },
        createdAt: new Date(Date.now() - 86400000 * 2).toISOString() // 2 days ago
        author: 'Bob The Builder',
        content: 'A comprehensive guide to CSS Flexbox, your ultimate tool for laying out content. Learn how to align, justify, and distribute items efficiently, making responsive design a breeze. From basic concepts to advanced techniques, this guide covers it all.',
        title: 'Mastering CSS Flexbox',
        _id: 'blog2',
    {
    },
        createdAt: new Date(Date.now() - 86400000 * 5).toISOString() // 5 days ago
        author: 'Alice Wonderland',
        content: 'Exploring the latest trends in React, Vue, and Angular. Building beautiful and interactive user interfaces has never been more exciting! Dive deep into component-based architecture, state management, and the power of hooks to create stunning web applications that truly engage users.',
        title: 'The Joys of Frontend Development',
        _id: 'blog1',
    {
const initialBlogsData = [
// Dummy blog data for initial load

import { useState } from 'react';
import BlogCard from '../components/BlogCard';