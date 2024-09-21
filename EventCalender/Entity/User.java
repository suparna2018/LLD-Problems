package EventCalender.Entity;
import java.time.*;

import EventCalender.DAO.EventScheduler;

public class User {
    public String Name;
    String UserId;
    LocalDateTime date;
    public EventScheduler eventScheduler;
    public User(String Name){
        this.Name=Name;
        eventScheduler=new EventScheduler();
        // Fill it
    }

    boolean AcceptReject(LocalDateTime dateTime,event e){
        if (this.eventScheduler.IfClash(date, null)) {
            return false;
        }
        return true;

    }
    public void NotificationFromSMS(event event){
        //Receives Notification via sms
        System.out.println(this.Name+ " ,you are invited to the event "+event.Title);
        // System.out.println("The event named "+event.Title+ " is going to satart in "+timeLeft+" minutes.");
    }

}
