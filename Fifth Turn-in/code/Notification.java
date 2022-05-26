public class Notification {

    // Attributes

    private User from;
    private User to;
    private String timeslot;

    public Notification(User from, User to, String timeslot){
        this.from = from;
        this.to = to;
        this.timeslot = timeslot;
    } // Constructor

    // Methods

    public void notifyOnAccept(){

    }

    public void notifyOnCancel(){

    }

    public void notifyOnComplete(){

    }
}
