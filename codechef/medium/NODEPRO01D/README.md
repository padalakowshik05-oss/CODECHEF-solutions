# NODEPRO01D

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### View and delete a note

Now we are on the last stage of our first project.

The last functionality we have to implement is viewing a single note and its content and an option to delete it.

#### Task:
- Complete the notes.js code to implement the functionality of viewing a particular note on /:title route. The titile name should not contain the.txt extension. And render the view-note.ejs to show the note on frontend.
- Complete the functionality of deleting the note on /:title/delete route. After deleting the note, go back to /notes route.
- Complete notes.ejs to link all the notes to their particular route and show its content.
- Complete the view-note.ejs to show the title as heading and content of the note. And add the route to delete the particular note.
#### Expected working:

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T14:35:44.758Z  

```cpp
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
```

---

[View on CodeChef](https://www.codechef.com/problems/NODEPRO01D)