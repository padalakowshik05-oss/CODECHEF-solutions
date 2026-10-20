const options = { timeZone: 'Asia/Kolkata', hour: 'numeric', hour12: false };
const currentHour = new Intl.DateTimeFormat('en-US', options).format(new Date());

let greeting;

if (currentHour < 12) {
    greeting = "Good Morning!";
} else if (currentHour < 17) {
// complete your code from here

console.log(currentHour);
    greeting = "Good Afternoon!";
} else {
    greeting = "Good Evening!";
}
console.log(greeting);
