# OJJAR225

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Implement Accordion!

You are given an incomplete `Accordion` component that renders a list of collapsible items. Your task is to implement the logic that allows users to  **expand and collapse**  items correctly.

 **Requirements** 

You need to complete the `Accordion` component such that:

- Only one item is open at a time.
- Clicking an already open item should close it.
- All items are closed by default on first render.

 **`AccordionItem` Component Interface** 

Each `AccordionItem` receives the following props:

- title — The title to display
- content — The content to show/hide
- isActive — A boolean that controls whether the content is visible
- onClick — A callback function triggered when the item is clicked

You do  **not**  need to edit the `AccordionItem` component.

 **Example Behavior** 

If there are 3 items:

- Initially, all are collapsed.
- Clicking item 2 will expand it.
- Clicking item 2 again will collapse it.
- Clicking item 1 will expand item 1 and collapse item 2.

 **What You Need to Do** 

- Add a useState hook to store the index of the currently active item (or null if none is active).
- Pass isActive={index === activeIndex} to each item.
- Implement onClick such that: If the clicked item is already open, close it. If a different item is clicked, open that one and close others.

 **Helpful Resources** 

- React Docs – State Hook (useState) https://reactjs.org/docs/hooks-state.html
- React Docs – Conditional Rendering https://reactjs.org/docs/conditional-rendering.html
- MDN – Array.map() https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/map

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T12:57:50.705Z  

```cpp
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
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR225)