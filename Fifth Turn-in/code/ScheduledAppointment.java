public class ScheduledAppointment extends Appointment {

    // Attributes

    private Private participant;
    private String meetingSpot;

    public ScheduledAppointment(PropertyManager host, String timeslot, Private participant, String meetingSpot){
        super(host, timeslot);
        this.participant = participant;
        this.meetingSpot = meetingSpot;
    } // Constructor

    // Methods

    public boolean checkForScheduledAppointment(){
        return true;
    }

    public void saveAppointment(){

    }

    public void deleteAppointment(){

    }

    public void cancelScheduleAppointment(){

    }
}
