function compress(board) {
// 1. Implement the compress function

}
  return newBoard;
  newBoard[r][c] = Math.random() < 0.9 ? 2 : 4;
        emptyTiles.push([r, c]);
      }
    }
  }
  if (emptyTiles.length === 0) {
    return newBoard;
  }
  const [r, c] = emptyTiles[getRandomInt(emptyTiles.length)];
  const emptyTiles = [];
  for (let r = 0; r < SIZE; r++) {
    for (let c = 0; c < SIZE; c++) {
      if (newBoard[r][c] === 0) {
  const newBoard = board.map(row => [...row]);
function addRandomTile(board) {

}
  return Math.floor(Math.random() * max);
function getRandomInt(max) {

}
function getEmptyBoard() {
  return Array(SIZE).fill(null).map(() => Array(SIZE).fill(0));

const SIZE = 4;

import { useState, useEffect } from 'react'; // useEffect is crucial here
import './App.css';