import java.util.List;

public class Appointment {

    // Attributes

    private Private participant;
    private String meetingSpot;
    private Timeslot timeslot;
    private  boolean completed;

    public Appointment(Private participant, Timeslot timeslot){
        this.participant = participant;
        this.meetingSpot = null;
        this.timeslot = timeslot;
        this.completed = false;
    } // Constructor

    // Methods

    public Private getParticipant(){

        return this.participant;
    }
    public void setParticipant(Private participant){

        this.participant = participant;
    }


    public String getMeetingSpot(){

        return this.meetingSpot;
    }

    public void setMeetingSpot(String meetingSpot){

        this.meetingSpot = meetingSpot;
    }


    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }


    public Timeslot getTimeslot() {
        return timeslot;
    }


    public boolean checkForScheduledAppointment(List<Appointment> appointmentsList){

        return appointmentsList.contains(this);
    }
}
