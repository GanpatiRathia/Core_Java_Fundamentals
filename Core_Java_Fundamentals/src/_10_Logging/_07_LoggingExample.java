// _07_LoggingExample.java
package _10_Logging;

import java.util.logging.Logger;

public class _07_LoggingExample {
    private static final Logger logger = Logger.getLogger(_07_LoggingExample.class.getName());

    public static void main(String[] args) {
        logger.info("This is an info log");
        logger.warning("This is a warning log");
        logger.severe("This is a severe error log");
    }
}