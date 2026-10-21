function Accordion({ items }) {
  // 1. State to store the index of the currently active/open item (null if all are closed)
  const [activeIndex, setActiveIndex] = useState(null);

  // 2. Click handler to toggle or switch active items
  const handleItemClick = (index) => {
    // If clicking the currently active item, close it (set to null). Otherwise, open the new index.
    setActiveIndex(activeIndex === index ? null : index);
  };

  return (
    <div className="accordion">
      {items.map((item, index) => (
        <AccordionItem
          key={index}
          title={item.title}
          content={item.content}
          // 3. Pass boolean to check if this specific item is active
          isActive={index === activeIndex}
          // 4. Pass the callback function when an item is clicked
          onClick={() => handleItemClick(index)}
        />
      ))}
    </div>
  );
}

export default Accordion;

import AccordionItem from './AccordionItem';
import { useState } from 'react';