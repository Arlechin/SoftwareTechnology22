public class AvailableAppointment extends Appointment {

    // Attributes
    private boolean available;
    private Private futureParticipant;

    public AvailableAppointment(PropertyManager host, String date, String timeslot){
        super(host, date, timeslot);
        available = true;
        futureParticipant = null;
    } // Constructor

    // Methods

    public void updateAvailableAppointment(boolean onDelete){

        if (onDelete == false){
            this.available = false; // Appointment scheduled - no longer available
        }
        else{
            this.available = true; // Appointment is available again
        }
    }

    public void selectAvailableAppointment(Private futureParticipant){
        this.futureParticipant = futureParticipant;
    }

    public ScheduledAppointment scheduleAppointment(String meetingSpot){

        ScheduledAppointment scheduledAppointment = new ScheduledAppointment(this.host, this.date, this.timeslot, this.futureParticipant, meetingSpot);
        this.available = false; // Appointment scheduled - no longer available

        return scheduledAppointment;
    }
}
