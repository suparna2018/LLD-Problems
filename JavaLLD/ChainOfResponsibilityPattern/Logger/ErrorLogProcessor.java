package JavaLLD.ChainOfResponsibilityPattern.Logger;

public class ErrorLogProcessor extends LogProcessor {
    ErrorLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(int loglevel,String msg){
       if(loglevel==ERROR){
        System.out.println("ERROR" +msg);
       }
       else{
        super.log(loglevel, msg);
       }

    }
}
