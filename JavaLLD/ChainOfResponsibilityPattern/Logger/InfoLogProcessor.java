package JavaLLD.ChainOfResponsibilityPattern.Logger;

public class InfoLogProcessor extends LogProcessor {
    InfoLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(int loglevel,String msg){
       if(loglevel==INFO){
        System.out.println("INFO" +msg);
       }
       else{
        super.log(loglevel, msg);
       }

    }
}