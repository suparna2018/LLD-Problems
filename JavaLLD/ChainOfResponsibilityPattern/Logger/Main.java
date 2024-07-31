package JavaLLD.ChainOfResponsibilityPattern.Logger;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObject=new DebugProcessor(new InfoLogProcessor(new ErrorLogProcessor(null)));

    logObject.log(LogProcessor.INFO, " Just for Info");
    logObject.log(LogProcessor.DEBUG, "need debug");
    logObject.log(LogProcessor.ERROR, " It is Error");
    }
}
