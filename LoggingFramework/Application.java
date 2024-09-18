package LoggingFramework;

public class Application {
    public static void main(String[] args) {
       Logger logger = Logger.getlogger();
       logger.Info("this is an info");
        logger.debug("this is a debug");
        logger.Error("this is an error");
    }
}