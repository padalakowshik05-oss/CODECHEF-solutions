# OJJAR193

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Contact Section

Alright, let's move on to the next challenge!

 **Problem Description:** 

To make it easy for people to connect with you, your portfolio needs a "Contact" section. This section will provide ways for visitors to reach out, such as via email or LinkedIn.

 **Note:** 

- The main container for this section should be a <section> element. It must have an id attribute set to contact. It must have a className attribute set to contact-section.
- Pay attention to the <a> tags used for the email and LinkedIn links. The email link should use the mailto: scheme in its href attribute. The LinkedIn link (and any other external links you might add) should include target="_blank" (to open in a new tab) and rel="noopener noreferrer" (for security and performance).

 **Your app's "Contact" section should aim to look something like this (structure and elements):**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T14:01:14.203Z  

```cpp

function Contact() { 
  return (
    <section id="contact" className="contact-section">
  );
}
      <h2>Contact Me</h2>
    </section>
      <p>Feel free to reach out to me via email or connect with me on LinkedIn!</p>
      <div className="contact-links">
        <a href="mailto:example@email.com">Email Me</a>
      </div>

        <a href="https://linkedin.com" target="_blank" rel="noopener noreferrer">
        </a>
          LinkedIn
  
export default Contact; 
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR193)