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
