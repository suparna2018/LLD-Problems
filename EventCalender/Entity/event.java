package EventCalender.Entity;
import java.util.ArrayList;
import java.time.*;

public class event {
    User Oganiser;
    public String Title;
    String Description;
    ArrayList<User> invitees;
    LocalDateTime dateTime;
    String Location;


    public event(User Organiser,ArrayList<User> invitees,LocalDateTime DateTime,String Title,String Location){
        this.Oganiser=Organiser;
        this.dateTime=DateTime;
        this.invitees=invitees;
        this.Title=Title;
        this.Location=Location;
    }

    public void remainder(int timeLeft){
        // sets remainder
        Duration duration= Duration.between(LocalDateTime.now(),this.dateTime);
        long m=duration.toMinutes();

        for(User user:this.invitees){

            if( m < timeLeft){
                user.NotificationFromSMS(this);
                System.out.println(timeLeft+" minutes left for the event "+ this.Title ); 
            }
       
        }
    }

    
}
