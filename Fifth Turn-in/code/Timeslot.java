public class Timeslot{

    // Attributes

    private PropertyManager host;
    private String date;
    private String time;
    private Ad ad;
    private boolean available;

    public Timeslot(PropertyManager host, String date, String time, Ad ad){
        this.host = host;
        this.date = date;
        this.time = time;
        this.ad = ad;
        available = true;
    } // Constructor

    // Methods

    public Ad getAd() {
        return ad;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public PropertyManager getHost() {
        return host;
    }

    public boolean isAvailable() {
        return available;
    }

    public void updateAvailability(boolean onDelete){

        if (onDelete == false){
            this.available = false; // Appointment scheduled - Timeslot no longer available
        }
        else{
            this.available = true; // Appointment deleted or modified - Timeslot is available again
        }
    }

    public Appointment selectAvailableTimeslot(Private participant){

        this.available = false;
        return new Appointment(participant, this);
    }

}
