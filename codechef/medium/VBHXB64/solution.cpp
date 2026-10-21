    } else {
            res.writeHead(400, { 'Content-Type': 'text/plain' });
        } else if (productId === '123') {
            res.end("Error: Product ID is required");
            res.writeHead(200, { 'Content-Type': 'text/plain' });
        } else if (productId == '456') {
            res.end("Product ID: 123, Name: Example Product, Price: $25");
            res.writeHead(200, { 'Content-Type': 'text/plain' });
        } else {
            res.end("Product ID: 456, Name: Another Product, Price: $50");
            res.writeHead(200, { 'Content-Type': 'text/plain' });
        }
            res.end(`Product ID: ${productId}, Name: Unknown Product, Price: $0`);
        res.writeHead(404, { 'Content-Type': 'text/plain' });
    }
});
        res.end("Not Found");


server.listen(3000);


        if (!productId || productId.trim() === '') {
        const productId = query.id;
    if (pathname === '/product'){

    const query = parsedUrl.query;
    const pathname = parsedUrl.pathname;
    const parsedUrl = url.parse(req.url, true);
const server = http.createServer((req, res) => {

const url = require('url');
const http = require('http');