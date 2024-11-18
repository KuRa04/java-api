package lang.InterfaceExample;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class LoggerExample {

    private static final Logger logger = System.getLogger(LoggerExample.class.getName());

    public static void main(String[] args) {
        // ログメッセージを出力
        logger.log(Level.INFO, "This is an info message.");
        logger.log(Level.WARNING, "This is a warning message.");
        logger.log(Level.ERROR, "This is an error message.");
        logger.log(Level.DEBUG, "This is a debug message.");
        logger.log(Level.TRACE, "This is a trace message.");

        // 例外を伴うログメッセージを出力
        try {
            throw new Exception("Sample exception");
        } catch (Exception e) {
            logger.log(Level.ERROR, "An exception occurred", e);
        }
    }
}
