public class CompletedAppointment extends Appointment {

    // Attributes

    private Private participant;
    private String meetingSpot;

    public CompletedAppointment(PropertyManager host, String timeslot, Private participant, String meetingSpot){
        super(host, timeslot);
        this.participant = participant;
        this.meetingSpot = meetingSpot;
    } // Constructor

    // Methods

    public void makeCompletedAppointment(){

    }

    public boolean checkForCompleteAppointment(){
        return true;
    }

    public boolean notAtLeastOneCompleteAppointment(){
        return true;
    }
}
