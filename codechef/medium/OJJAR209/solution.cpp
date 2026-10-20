import styles from './styles.module.css'; 

function PriceDisplay({ price }) {
  console.log(`Rendering PriceDisplay with price: ${price}, key: ${price}`);

  return (
    <div className={styles.wrapper}>
      {/*This code will only show the animation when the app render first time*/}
      <div key={price} className={styles.animated}>
        {`$` + price}
      </div>
    </div>
  );
}

export default PriceDisplay;