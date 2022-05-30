import java.time.LocalDateTime;
import java.util.List;

public class Appointment {

    // Attributes

    private Private participant;
    private String meetingSpot;
    private Timeslot timeslot;
    private  boolean completed;
    private boolean scheduled;
    private LocalDateTime requestedTimestamp;
    private boolean alternative;

    public Appointment(Private participant, Timeslot timeslot){
        this.participant = participant;
        this.meetingSpot = null;
        this.timeslot = timeslot;
        this.completed = false;
        this.scheduled = false;
        this.requestedTimestamp = LocalDateTime.now();
        this.alternative = false;
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

    public void setCompleted() {

        this.completed = true;
    }


    public boolean isAlternative() {
        return alternative;
    }

    public void setAlternative() {
        this.alternative = true;
    }


    public boolean isScheduled() {
        return scheduled;
    }

    public void setScheduled(boolean scheduled) {
        this.scheduled = scheduled;
    }

    public Timeslot getTimeslot() {
        return timeslot;
    }


    public boolean checkForScheduledAppointment(List<Appointment> appointmentsList){

        return appointmentsList.contains(this);
    }

    public LocalDateTime getRequestedTimestamp() {
        return requestedTimestamp;
    }

    public void updateTimeslot(Timeslot oldTimeslot, Timeslot newTimeslot){
        this.timeslot = newTimeslot;
        oldTimeslot.updateAvailability(true);
        newTimeslot.updateAvailability(false);
    }
}
