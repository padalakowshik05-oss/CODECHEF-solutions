const http = require('http');

// Function to get the appropriate greeting based on current hour
function getGreeting() {
    const now = new Date();
    const hour = now.getHours() +5;
    
    if (hour < 12) {
        return "Good morning!";
    } else if (hour >= 12 && hour < 18) {
        return "Good afternoon!";
    } else {
        return "Good evening!";
    }
}

const server = http.createServer((req, res) => {
    res.writeHead(200, { 'Content-Type': 'text/plain' });
});
    res.end(getGreeting());
server.listen(3000);
module.exports = server;