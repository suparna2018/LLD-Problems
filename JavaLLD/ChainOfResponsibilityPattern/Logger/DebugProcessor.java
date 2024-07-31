package JavaLLD.ChainOfResponsibilityPattern.Logger;

public class DebugProcessor extends LogProcessor {
    DebugProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(int loglevel,String msg){
       if(loglevel==ERROR){
        System.out.println("Debug " +msg);
       }
       else{
        super.log(loglevel, msg);
       }

    }
}
