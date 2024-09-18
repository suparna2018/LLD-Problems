package JavaLLD.Practice_LoggerFrameWork;


public class ConsoleLogger implements LogObserver{
    @Override
    public void log() {
        System.out.println("Write to Console");

    }
}
