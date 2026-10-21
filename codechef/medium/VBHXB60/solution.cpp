const http = require('http');

const USERNAME = "Harry";

const server = http.createServer((req, res) => {
    res.writeHead(200, { 'Content-Type': 'text/plain' });

    if ( USERNAME && USERNAME.trim() !== '') {
        res.write('Hello, ${USERNAME.trim()}!');
    } else {
        res.write("Hello, Guest!");
    }
});
    res.end();

server.listen(3000);
