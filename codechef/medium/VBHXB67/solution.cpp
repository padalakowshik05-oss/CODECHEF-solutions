const server = http.createServer((req, res) => {
  if (req.url === '/') {
    res.writeHead(200, { 'Content-Type': 'text/plain' });
    res.end('Welcome to the server!');
  } else if (req.url === '/message') {




  
  else {
    res.writeHead(404, { 'Content-Type': 'text/plain' });
    res.end('Not Found');
  }
});

const port = 3000;
server.listen(port, () => {
    const filePath = path.join(__dirname, 'public', 'message.txt');
  }
    fs.readFile(filePath, 'utf8', (err, data) => {
      if (err) {
    });
        res.writeHead(500, { 'Content-Type': 'text/plain' });
      } else {
        res.end('500 Internal Server Error');
          res.writeHead(200, { 'Content-Type': 'text/plain' });
      }
          res.end(data);
  console.log(`Server listening on port ${port}`);
});
