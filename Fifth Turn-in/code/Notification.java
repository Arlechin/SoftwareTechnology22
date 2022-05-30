import java.time.LocalDateTime;

public class Notification {

    enum notificationType{
        ACCEPT,
        CANCEL,
        COMPLETE,
        NEW
    }

    // Attributes

    private User from;
    private User to;
    private LocalDateTime dateTime;
    private notificationType type;

    public Notification(User from, User to){
        this.from = from;
        this.to = to;
        this.dateTime = LocalDateTime.now();
        this.type = null;
    } // Constructor

    // Methods


    public User getFrom() {
        return from;
    }

    public User getTo() {
        return to;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void notifyOnAccept(){
        this.type = notificationType.ACCEPT;
    }

    public void notifyOnCancel(){
        this.type = notificationType.CANCEL;
    }

    public void notifyOnComplete(){
        this.type = notificationType.COMPLETE;
    }

    public void notifyOnNew(){
        this.type = notificationType.NEW;
    }

    public void printNotification(Appointment appointment){
        if (this.type == notificationType.ACCEPT){
            System.out.println("Appointment scheduled for " + appointment.getTimeslot().getDate() + " - " + appointment.getTimeslot().getTime() + "for ad " + appointment.getTimeslot().getAd().getTitle() + " with " + this.from);
        }
        else if (this.type == notificationType.CANCEL) {
            System.out.println("Appointment with " + this.from + " scheduled for " + appointment.getTimeslot().getDate() + " - " + appointment.getTimeslot().getTime() + " for ad " + appointment.getTimeslot().getAd().getTitle() + " canceled");
        }
        else if (this.type == notificationType.COMPLETE) {
            System.out.println("Appointment with " + this.from + " scheduled for " + appointment.getTimeslot().getDate() + " - " + appointment.getTimeslot().getTime() + " for ad " + appointment.getTimeslot().getAd().getTitle() + " completed");
        }
        else if (this.type == notificationType.NEW) {
            System.out.println("New appointment request with " + this.from + " for " + appointment.getTimeslot().getDate() + " - " + appointment.getTimeslot().getTime() + " for ad " + appointment.getTimeslot().getAd().getTitle());
        }
    }
}
