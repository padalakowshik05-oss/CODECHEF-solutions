# VBHXB19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Recipe Preparation

Let's simulate preparing a sandwich using `async/await`. We'll create three asynchronous functions: `prepareBread`, `addFilling`, and `wrapSandwich`. Each function will simulate a step in the sandwich-making process and will take a certain amount of time. The `prepareSandwich` function will then use `async/await` to orchestrate these steps and return a complete sandwich.

### Task:

Your task is to create an `async` function called `prepareSandwich` that uses `await` to call `prepareBread`, `addFilling`, and `wrapSandwich` in sequence.
The `prepareSandwich` function should then return a message `Sandwich is ready to eat!` indicating that the sandwich is ready.
Now complete the following `prepareSandwich` function using `async/await`.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T06:55:15.339Z  

```cpp
    }, 500); // Simulate wrapping for 0.5 seconds
  });
}

async function prepareSandwich() {
 const step1 = await prepareBread();
 console.log(step1);
 const step2 = await addFilling();
 console.log(step2);
 const step3 = await wrapSandwich();
 console.log(step3);
}
prepareSandwich();
      resolve("Sandwich wrapped!");
    setTimeout(() => {
  return new Promise(resolve => {
function wrapSandwich() {

}
    }, 2000); // Simulate adding filling for 2 seconds
  });
  return new Promise(resolve => {
    setTimeout(() => {
      resolve("Filling added!");
function addFilling() {

}
  });


 return "Sandwich is ready to eat!";

```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB19)