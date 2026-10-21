                                                    }
                                                newBoard[c][r] = board[r][c];
                                          for (let c = 0; c < SIZE; c++) {
                                      for (let r = 0; r < SIZE; r++) {
                                    const newBoard = getEmptyBoard();
                                  function transpose(board) {

                                newBoard[r][c] = Math.random() < 0.9 ? 2 : 4;
                                  return newBoard;
                                  }
                              const [r, c] = emptyTiles[getRandomInt(emptyTiles.length)];
                            const newBoard = board.map(row => [...row]);
                        }
                          if (emptyTiles.length === 0) return board;
                      }
            for (let c = 0; c < SIZE; c++) {
                  if (board[r][c] === 0) emptyTiles.push([r, c]);
      const emptyTiles = [];
        for (let r = 0; r < SIZE; r++) {
    function addRandomTile(board) {
  return Array(SIZE).fill().map(() => Array(SIZE).fill(0));
  }

  function getRandomInt(max) {
    return Math.floor(Math.random() * max);
    }

function getEmptyBoard() {

const SIZE = 4;

import './App.css'; // Assuming you have this CSS file and it styles .game-over and .restart
import { useEffect, useState } from 'react';