const cartPrices = [29.99, 9.99, 4.99, 14.99, 25.00];

// complete the code 
// Using reduce to calculate the total price
const totalPrice =cartPrices.reduce((acc,price) => acc + price,0);
console.log(totalPrice);