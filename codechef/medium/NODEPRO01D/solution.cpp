                                                    if (err) return res.status(500).send('Failed to save note');
                                                            res.redirect('/notes');
                                                                });
                                                                });

                                        const filePath = path.join(notesDir, `${title}.txt`);
                                            fs.writeFile(filePath, content, err => {
                                    if (!title || !content) return res.send('Missing fields');


                                const { title, content } = req.body;
                            router.post('/add', (req, res) => {
                            // Add Note Logic
                            res.render('add-note');
                            });

                        router.get('/add', (req, res) => {
                        // Form Page to Add Note

                        });
                        });
                    res.render('notes', { notes: files });
            if (err) return res.status(500).send('Error reading notes');
    fs.readdir(notesDir, (err, files) => {
router.get('/', (req, res) => {
// View All Notes


const notesDir = path.join(__dirname, '..', 'notes');
const express = require('express');
const fs = require('fs');
const path = require('path');
const router = express.Router();