import java.util.List;

public class ScheduledAppointment extends Appointment {

    // Attributes

    private Private participant;
    private String meetingSpot;

    public ScheduledAppointment(PropertyManager host, String date, String timeslot, Ad ad, Private participant, String meetingSpot){
        super(host, date, timeslot, ad);
        this.participant = participant;
        this.meetingSpot = meetingSpot;
    } // Constructor

    // Methods

    public void setParticipant(Private participant){

        this.participant = participant;
    }

    public Private getParticipant(){

        return this.participant;
    }

    public void setMeetingSpot(String meetingSpot){

        this.meetingSpot = meetingSpot;
    }

    public String getMeetingSpot(){

        return this.meetingSpot;
    }

    public CompletedAppointment makeCompletedAppointment(){

        CompletedAppointment completedAppointment = new CompletedAppointment(this.host, this.date, this.timeslot, this.ad, this.participant, this.meetingSpot);
        return completedAppointment;
    }

    public boolean checkForScheduledAppointment(List<ScheduledAppointment> scheduledAppointmentsList){

        return scheduledAppointmentsList.contains(this);
    }

    public void save(List<ScheduledAppointment> scheduledAppointmentsList){

        scheduledAppointmentsList.add(this);
    }

    public void delete(List<ScheduledAppointment> scheduledAppointmentsList){

        scheduledAppointmentsList.remove(this);
    }
}
