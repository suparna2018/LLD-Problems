package LoggingFramework;

public class AbstractLogger {
    int levels;
    private AbstractLogger nextAbstractLogger;

    void setnextAbstractLogger(AbstractLogger nextAbstractLogger){
        this.nextAbstractLogger=nextAbstractLogger;
    }
    public void logMessage(int level,String message,LoggerSubject loggerSubject) {
        if(this.levels==level){
            display( message,loggerSubject);
        }
        if (nextAbstractLogger!=null){
            nextAbstractLogger.logMessage(level, message, loggerSubject);
        }
        
    }
    protected void display(String msg, LoggerSubject loggerSubject) {
    }
}
