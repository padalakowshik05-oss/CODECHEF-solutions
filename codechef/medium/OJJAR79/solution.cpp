      <h3>{props.product.name}</h3>
    >
    </div>
  );
}

function App() {
  return (
       }}
          : "2px solid rgb(128, 128, 128)",
    <div className="container">
      <h1>Product List</h1>
      <div className="product-list">
        
        {products.map((product) => (
          <ProductCard key={product.id} product={product} />
        ))}
      </div>
      <p>Price: ${props.product.price}</p>
      <button onClick={handleClick}>Select</button>
    </div>
  );
}
          ? "2px solid rgb(255, 0, 0)"
          props.product.price > 50
        border:
      style={{
      role="article"
    <div 
      className="product-card"
  return (

  }