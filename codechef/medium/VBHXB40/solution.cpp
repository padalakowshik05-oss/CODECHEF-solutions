const path = require('path');
const os = require('os');

const filePath = '/users/john/documents/report.txt';
const fileName = path.basename(filePath);

console.log('Extracted filename:', fileName);
const platform = os.platform();
console.log('Operating System Platform:', platform);