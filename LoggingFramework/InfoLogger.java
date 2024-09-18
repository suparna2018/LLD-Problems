package LoggingFramework;

public class InfoLogger extends AbstractLogger  {
    InfoLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void display(String msg, LoggerSubject loggerSubject) {

        loggerSubject.notifyAllObserver(2,"Info : "+msg);
    }
}
