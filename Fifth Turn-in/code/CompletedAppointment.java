public class CompletedAppointment extends Appointment {

    // Attributes

    private Private participant;
    private String meetingSpot;

    public CompletedAppointment(PropertyManager host, String date, String timeslot, Ad ad, Private participant, String meetingSpot){
        super(host, date, timeslot, ad);
        this.participant = participant;
        this.meetingSpot = meetingSpot;
    } // Constructor

    // Methods

    public boolean checkForCompleteAppointment(){
        return true;
    }

    public boolean notAtLeastOneCompleteAppointment(){
        return true;
    }

    public Private getParticipant() {
        return participant;
    }

    public String getMeetingSpot() {
        return meetingSpot;
    }
}
