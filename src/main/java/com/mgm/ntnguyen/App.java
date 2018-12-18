package com.mgm.ntnguyen;

import java.util.Properties;
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
    App app = new App();
    String version = app.getVersion();
    logger.info("This is hard printing from version 1.0.2");
    logger.info("You are running on version: " + version);
  }

  private String getVersion() {
    Properties properties = new Properties();
    try {
      properties
          .load(this.getClass().getClassLoader().getResourceAsStream("maven-release.properties"));
      return properties.getProperty("app.version");
    } catch (Exception e) {
      logger.error("Cannot detect the version!", e);
      return "Cannot detect the version";
    }
  }
}
