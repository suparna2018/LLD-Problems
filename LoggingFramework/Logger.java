package LoggingFramework;

import java.io.Serializable;


public class Logger implements Cloneable,Serializable {
    private volatile static Logger logger;
    private volatile static AbstractLogger chainOfLogger;
    private volatile static LoggerSubject loggerSubject;
    
// Following is the constructor of Logger, Constructor will never have any return anything
    public Logger(){    
        if (logger!=null){
            throw new IllegalStateException("logger Object already created");
        }
    }


 public static Logger getlogger(){
    if (logger==null){
        synchronized(Logger.class){
            if (logger==null){
                logger= new Logger();
                chainOfLogger=LogManager.doChaining();
                loggerSubject=LogManager.addObservers();
            }
            
        }
    }
    return logger;
 }


 protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
}

protected Object readResolve(){
    return logger;

}

public void Info(String msg){
    createLog(1,msg);
}

public void Error(String msg){
    createLog(2,msg);
}
public void debug(String msg){
    createLog(3,msg);
}
public void createLog(int lv,String msg){
    chainOfLogger.logMessage(lv,msg,loggerSubject);
}


}


