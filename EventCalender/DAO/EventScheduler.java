package EventCalender.DAO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import EventCalender.Entity.User;
import EventCalender.Entity.event;
import java.time.*;


public class EventScheduler {
    HashMap<LocalDateTime,event> EventLists;

    public EventScheduler(){
        EventLists=new HashMap();
        
    }

    public void addEvent(User Organizer,LocalDateTime localDateTime, event event){
        EventLists.put(localDateTime, event);
        System.out.println("Hey!!!"+ Organizer.Name +" ,Event::: "+event.Title+" added successfully to your calender");

    }
    public boolean IfClash(LocalDateTime dateTime, event event){
        if(EventLists.containsKey(dateTime)){
           if (EventLists.get(dateTime).Title !=event.Title  ){
                System.out.println("The current event has a clash with another event");
                return true;
           }
        }
        return false;
    }
    public void Start(LocalDateTime dateTime){
        if (LocalDateTime.now().isAfter( dateTime)){
            System.out.println("Event Started");
        }
        else{
            //None
        }
    }
}
