import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NotificationsList {

    // Attributes

    List<Notification> list;

    public NotificationsList(){
        this.list = new ArrayList<>();
    }

    // Methods

    public void getNotifications(User currentUser, Appointment appointment){

        Iterator<Notification> iterator = this.list.iterator();

        int i = 1;
        List<Notification> list = new ArrayList<>();

        //simple iteration
        while(iterator.hasNext()){
            Notification notification = iterator.next();
            if (notification.getTo() == currentUser){
                System.out.print(i + ".");
                notification.printNotification(appointment);
                i += 1;
                list.add(notification);
            }
        }
    }
}
