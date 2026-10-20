function FAQAccordion({ items }) {
  if (!items || items.length === 0) {
    return <p>No FAQ items to display.</p>;
  }

  return (
    <Accordion.Root className={styles.container} type="single" collapsible={true}>
    
  );
}
      {items.map(({ id, question, answer }) => (
        <Accordion.Item key={id} value={id} className={styles.item}>
      ))}

          <Accordion.Header>
            <Accordion.Trigger className={styles.trigger}>
              {question}
            </Accordion.Trigger>
          </Accordion.Header>
          <Accordion.Content className={styles.content}>
            {answer}
          </Accordion.Content>
        </Accordion.Item>
      </Accordion.Root>
export default FAQAccordion;


// Hint: You'll need Accordion.Root, Accordion.Item, Accordion.Header, Accordion.Trigger, Accordion.Content
import * as Accordion from '@radix-ui/react-accordion';
import styles from './FAQAccordion.module.css'; // Using CSS Modules