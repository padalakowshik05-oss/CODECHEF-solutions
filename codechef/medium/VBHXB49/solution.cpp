const path = require('path');

const directory = 'books';
const genre = 'fiction';
const fileName = 'The_Great_Novel.pdf';

const relativePath = path.join(directory, genre, fileName);

const absolutePath = path.resolve(relativePath);

const parsedPath = path.parse(absolutePath);

const newFileName = parsedPath.name + '.epub';

const newAbsolutePath = path.join(parsedPath.dir, newFileName);

console.log('Original Absolute Path:', absolutePath);
console.log('New Absolute Path:', newAbsolutePath);
