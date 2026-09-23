let numbers = [10, -5, 0, 3, -2, 7, -1, 4];

let positiveNumbers=numbers.filter((number) => {
    return number>=0;
});
console.log(positiveNumbers);