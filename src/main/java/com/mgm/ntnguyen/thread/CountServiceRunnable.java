package com.mgm.ntnguyen.thread;

import com.mgm.ntnguyen.CountService;
import org.apache.log4j.Logger;

public class CountServiceRunnable implements Runnable {

  private final String threadName;
  private static final Logger logger = Logger.getLogger(CountService.class);

  public CountServiceRunnable(String threadName) {
    this.threadName = threadName;
  }

  /**
   * When an object implementing interface <code>Runnable</code> is used to create a thread,
   * starting the thread causes the object's
   * <code>run</code> method to be called in that separately executing
   * thread.
   * <p>
   * The general contract of the method <code>run</code> is that it may take any action whatsoever.
   *
   * @see Thread#run()
   */
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      logger.info("Runnable thread [" + threadName + "]: " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        logger.error("Error in thread", e);
        Thread.currentThread().interrupt();
      }
    }
  }
}
