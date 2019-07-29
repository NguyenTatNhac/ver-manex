package com.mgm.ntnguyen;

import org.apache.log4j.Logger;

public class CountService {

  private static CountService countService;

  private CountService() {
  }

  private static final Logger logger = Logger.getLogger(CountService.class);

  public synchronized void count(String threadName) {
    for (int i = 0; i < 10; i++) {
      logger.info("Thread [" + threadName + "]: " + i);
      try {
        Thread.sleep(300);
      } catch (InterruptedException e) {
        logger.error("Error in thread", e);
        Thread.currentThread().interrupt();
      }
    }
  }

  public synchronized static CountService getInstance() {
    if (countService == null) {
      countService = new CountService();
    }
    return countService;
  }
}
