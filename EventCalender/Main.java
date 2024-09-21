package EventCalender;
import java.util.*;

import EventCalender.Service.GoogleMeet;
import EventCalender.Entity.User;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        GoogleMeet googleMeet=new GoogleMeet();
        
        User user1=new User("Suparna");
        LocalDateTime dateTime1=dateTimeFormatter.ThedateTimeFormatter("2024-09-21 11:50:00");
        User user2=new User("Payel");
        User user3=new User("Rituparna");
        User user4=new User("Alexandra");

        // Meetinf 1
        ArrayList<User> invitees= new ArrayList();
        invitees.add(user2);
        invitees.add(user3);
        googleMeet.ScheduleMeeting(user1,invitees,dateTime1," TEAM INFO SHARING SESH");


        // Meeting 2
        ArrayList<User> invitees1= new ArrayList();
        invitees1.add(user4);
        googleMeet.ScheduleMeeting(user2,invitees1,dateTime1,"Sprint Retro meeting");

    }
}

class dateTimeFormatter{
    static LocalDateTime ThedateTimeFormatter(String dateTime){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime givenDateTime=LocalDateTime.parse(dateTime,formatter);
        LocalDateTime currDateTime=LocalDateTime.now();

        if(givenDateTime.isBefore(currDateTime)){
            System.out.println("Invalid Date or time");
        }
        return givenDateTime;

    }
}