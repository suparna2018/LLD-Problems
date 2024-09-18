package JavaLLD.Practice_LoggerFrameWork;

public class FileLogger implements LogObserver{
    @Override
    public void log() {
        System.out.println("Write to File");

    }
}

