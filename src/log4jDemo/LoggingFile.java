package log4jDemo;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LoggingFile {

    private static final Logger log = LogManager.getLogger(LoggingFile.class.getName());

    public static void main(String[] args) {
        log.debug("Debug message logged");
        log.error("Error message logged");
        log.fatal("Fatal message logged");
    }
}