    return new Promise((resolve) => {
      setTimeout(() => {
        resolve("Ice cream with toppings: " + frozenIceCream);
      }, 500);
    });
  }

console.log("Ice cream making in progress...");

getIngredients()
 .then((ingredients) => {
  console.log("1. Ingredients acquired:", ingredients);
  return mixIngredients(ingredients);
 })
 .then((mixedIngredients) => {
  console.log("2. Ingredients mixed:", mixedIngredients);
  return freezeMixture(mixedIngredients);
 })
 .then((frozenIceCream) => {
  console.log("3. Ice cream frozen:", frozenIceCream);
  return addToppings(frozenIceCream);
 })
 .then((finalIceCream) => {
  console.log("4. Toppings added:", finalIceCream);
 })
 .catch((error) => {
  console.error("Error:", error);
 });