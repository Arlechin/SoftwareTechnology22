public class Appointment {

    // Attributes

    protected PropertyManager host;
    protected String date;
    protected String timeslot;
    protected Ad ad;

    public Appointment(PropertyManager host, String date, String timeslot, Ad ad){
        this.host = host;
        this.date = date;
        this.timeslot = timeslot;
        this.ad = ad;
    } // Constructor

    // Methods


    public Ad getAd() {
        return ad;
    }

    public PropertyManager getHost() {
        return host;
    }

    public String getDate() {
        return date;
    }

    public String getTimeslot() {
        return timeslot;
    }
}
