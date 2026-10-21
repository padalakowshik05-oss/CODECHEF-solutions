  }, [])

  return (
    <div style={{ fontFamily: 'sans-serif', padding: '20px' }}>
      <h1>📈 Crypto Dashboard</h1>
      <p>Updates every 5 seconds...</p>

      <table style={{ borderCollapse: 'collapse', marginTop: '20px', width: '100%', maxWidth: '400px' }}>
        <thead>
          <tr>
            <th style={{ padding: '8px', border: '1px solid gray', textAlign: 'left' }}>Name</th>
            <th style={{ padding: '8px', border: '1px solid gray', textAlign: 'right' }}>Price ($)</th>
    return () => clearInterval(intervalId)
      setPrices(data)
    }

    // Initial fetch
    updatePrices()

    // Poll every 5 seconds
    const intervalId = setInterval(updatePrices, 5000)

    // Cleanup on unmount

  useEffect(() => {
    // Function to fetch and update prices
    const updatePrices = async () => {
      const data = await fetchCryptoPrices()
  const [prices, setPrices] = useState([])
function App() {

import { useState, useEffect } from 'react'
import { fetchCryptoPrices } from './data'