# VBHXB18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Simulate Coffee Order

Let's simulate a coffee ordering process using `async/await`. We'll create three asynchronous functions: `grindCoffeeBeans`, `brewCoffee`, and `pourCoffee`. Each function will simulate a step in the coffee-making process and will take a certain amount of time. The `placeOrder` function will then use `async/await` to orchestrate these steps and return a complete cup of coffee.

#### Task:

You have to complete the code to print all the steps of making the coffee.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T15:54:35.601Z  

```cpp
  async function placeOrder() {
    try {
      const grindResult = await grindCoffeeBeans();
      console.log(grindResult);
  
      const brewResult = await brewCoffee();
      
  
      return "☕ Your coffee is ready!";
    } catch (error) {
      return "Something went wrong while making your coffee.";
    }
  }
  
  placeOrder().then(result => console.log(result));
  
  }
    });
      }, 500); // Simulate pouring for 0.5 seconds
        resolve("Coffee poured!");
      setTimeout(() => {
      console.log(brewResult);
      const pourResult = await pourCoffee();
      console.log(pourResult);
  
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB18)