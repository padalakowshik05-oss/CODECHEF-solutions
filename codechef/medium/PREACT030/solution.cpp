    <div
      className="product-card"
      role="article"
      style={{
        border: props.product.price > 50
          ? "2px solid rgb(255, 0, 0)"
          : "2px solid rgb(128, 128, 128)"
      }}
    >
      <h3>{props.product.name}</h3>
      <p>Price: ${props.product.price}</p>
      <button onClick={handleClick}>Select</button>
    </div>
  );
}


  return (
  }
    alert(`Product Selected: ${props.product.name}`);
  function handleClick() {
function ProductCard(props) {

];
  { id: 5, name: "USB Cable", price: 10 },
  { id: 4, name: "Monitor", price: 150 },
  { id: 3, name: "Keyboard", price: 40 },
  { id: 2, name: "Mouse", price: 20 },
  { id: 1, name: "Laptop", price: 900 },
const products = [

// Our list of products - you don't need to change this
import "./App.css";