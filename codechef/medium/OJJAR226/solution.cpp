import { useState } from 'react';
import ListItem from './ListItem';

function FilterableList({ items }) {
  const [searchTerm, setSearchTerm] = useState('');

  // Filter items based on name or description in a case-insensitive manner
  const filteredItems = items.filter(item =>
    item.name.toLowerCase().includes(searchTerm.toLowerCase()) ||
    item.description.toLowerCase().includes(searchTerm.toLowerCase())
  );

  return (
    <div className="filterable-list">
      <input
        type="text"
        placeholder="Search items..."
        value={searchTerm}
        onChange={(e) => setSearchTerm(e.target.value)}
        className="search-input"
      />

      <div className="list">
        {filteredItems.length > 0 ? (
          filteredItems.map(item => (
            <ListItem key={item.id} item={item} />
          ))
        ) : (
          <p className="no-results">No items found</p>
        )}
      </div>
    </div>
  );