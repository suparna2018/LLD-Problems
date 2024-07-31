package JavaLLD.ChainOfResponsibilityPattern.Logger;

public class LogProcessor {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;

    public LogProcessor nextloggerProcssor;

    public LogProcessor(LogProcessor loggerProcssor){
        this.nextloggerProcssor=loggerProcssor;
    }

    public void log(int loglevel,String msg){
        if (nextloggerProcssor!=null){
              nextloggerProcssor.log(loglevel,msg);
        }

    }
}
