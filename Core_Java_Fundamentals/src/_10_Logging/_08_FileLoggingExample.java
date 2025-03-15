// _08_FileLoggingExample.java
package _10_Logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class _08_FileLoggingExample {
    private static final Logger logger = Logger.getLogger(_08_FileLoggingExample.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("logfile.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            
            logger.info("Logging into a file");
            logger.warning("This is a warning log entry");
        } catch (IOException e) {
            System.out.println("Logging failed: " + e.getMessage());
        }
    }
}