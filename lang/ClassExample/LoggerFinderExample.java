package lang.ClassExample;

import java.lang.System.Logger;
import java.lang.System.LoggerFinder;

public class LoggerFinderExample {
  public static void main(String[] args) {
    // Obtain LoggerFinder instance
    LoggerFinder loggerFinder = LoggerFinder.getLoggerFinder();

    // Get Logger instance for a specific module
    Module currentModule = LoggerFinderExample.class.getModule();
    Logger logger = loggerFinder.getLogger("com.example.myapp", currentModule);

    // Log messages with various levels
    logger.log(Logger.Level.INFO, "This is an informational message.");
    logger.log(Logger.Level.WARNING, "This is a warning message.");
    logger.log(Logger.Level.ERROR, "This is an error message.");

    // Logging with debug level
    logger.log(Logger.Level.DEBUG, "Debugging info goes here.");
  }
}