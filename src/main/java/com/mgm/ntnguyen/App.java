package com.mgm.ntnguyen;

import com.mgm.ntnguyen.thread.CountServiceThread;
import org.apache.log4j.Logger;

/**
 * Hello world.
 */
public class App {

  private static final Logger logger = Logger.getLogger(App.class);

  /**
   * Method to run the app.
   */
  public static void main(String[] args) {
    for (int i = 0; i <= 10; i++) {
      try {
        logger.info(getString(i));
        CountServiceThread thread = new CountServiceThread("");
        thread.start();
        thread.join();
      } catch (Exception e) {
        logger.error("Sth not run", e);
      }
    }
  }

  private static String getString(int i) {
    if (i == 7) {
      throw new RuntimeException("Hehe");
    }
    return "Number: " + i;
  }
}
