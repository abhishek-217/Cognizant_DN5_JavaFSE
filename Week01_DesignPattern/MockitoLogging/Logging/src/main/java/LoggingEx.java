import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingEx {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingEx.class);

    public static void main(String[] args) {

        logger.error("This is an error message: Kindly check!!");

        logger.warn("Warning from my side please check !!");
    }
}