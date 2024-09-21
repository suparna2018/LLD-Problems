package EventCalender.Service;
import java.util.*;
import EventCalender.Entity.event;
import java.time.*;
import EventCalender.Entity.User;


public class GoogleMeet {
// String Organiser,ArrayList<User> invitees,LocalDateTime DateTime,String Title,String Location
    public void ScheduleMeeting(User user, ArrayList<User> invitees,LocalDateTime dateTime,String Title){
        event Event1=new event(user,invitees,dateTime,Title,"ONLINE");

        if(!user.eventScheduler.IfClash(dateTime,Event1)){
            System.out.println();
            user.eventScheduler.addEvent(user,dateTime,Event1);
            System.out.println(user.Name+ " You have scheduled the event" + Event1.Title + " successfully.");
            System.out.println();
        }
        for(User user1: invitees){
            if(!user1.eventScheduler.IfClash(dateTime,Event1)){

                user1.eventScheduler.addEvent(user1,dateTime,Event1);
                user1.NotificationFromSMS(Event1);
                System.out.println("----------------------------------------------------------");
            }
            else{
                System.out.println(user1.Name+"You have another event already Scheduled.");
                System.out.println("------------------------------");
            }
        }
        int remainder=15;
       Event1.remainder(remainder);
        user.eventScheduler.Start(dateTime);

    }
}
