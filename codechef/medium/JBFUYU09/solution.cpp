    res.status(400).json({ error: error.message });
  }
});

// 4. DELETE /books/:id -> Delete a book
app.delete("/books/:id", async (req, res) => {
  try {
    const { id } = req.params;
    const deletedBook = await Book.findByIdAndDelete(id);

    if (!deletedBook) {
      return res.status(404).json({ message: "Book not found" });
    }

    res.json({
      message: "Book deleted successfully",
      deletedBook,
    });
  } catch (error) {
    res.status(400).json({ error: error.message });
  }
});

// Start the server
const PORT = process.env.PORT || 8080;
app.listen(PORT, () => {
  console.log(`Bookshelf API running at http://localhost:${PORT}`);
});
