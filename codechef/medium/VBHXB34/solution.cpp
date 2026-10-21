    console.log(`setInterval run ${count}`);
    if (count === 2) {
      clearInterval(intervalId);
    }
  }, 500);
}

module.exports = {
  runImmediate,
  runTimeout,
  runLimitedInterval,
};

if (require.main === module) {
  runImmediate();
  runTimeout();
  runLimitedInterval();
}
