import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppointmentsList {

    // Attributes

    private List<Appointment> list;

    public AppointmentsList(){
        this.list = new ArrayList<>();
    }

    // Methods

    public Appointment searchInAppointments(Ad relatedAd, Private participant){

        Iterator<Appointment> iterator = this.list.iterator();

        //simple iteration
        while(iterator.hasNext()){
            Appointment appointment = iterator.next();
            if ((appointment.getParticipant() == participant) && (appointment.getTimeslot().getAd() == relatedAd)) {
                return appointment;
            }
        }
        return null;
    }

    public void save(Appointment appointment){
        this.list.add(appointment);
    }

    public void delete(Appointment appointment)
    {
        appointment.getTimeslot().updateAvailability(true);
        this.list.remove(appointment);
    }

    public List<Appointment> getAppointments(Private currentUser){

        Iterator<Appointment> iterator = this.list.iterator();

        int i = 1;
        List<Appointment> list = new ArrayList<>();

        //simple iteration
        while(iterator.hasNext()){
            Appointment appointment = iterator.next();
            if ((appointment.isCompleted() == false) && (appointment.isScheduled() == false) && (appointment.getParticipant() == currentUser)){

                System.out.println(i + "." + "New appointment request with " + appointment.getTimeslot().getHost() + " for " + appointment.getTimeslot().getDate() + " - " + appointment.getTimeslot().getTime() + " for ad " + appointment.getTimeslot().getAd().getTitle());
                if (appointment.getMeetingSpot() != null){
                    System.out.println("New timeslot and meeting spot proposed!");
                }
                System.out.println("~~~~~~~~~~");
                i += 1;
                list.add(appointment);
            }
        }
        return list;
    }

    public List<Appointment> getScheduledAppointments(Private currentUser){

        Iterator<Appointment> iterator = this.list.iterator();

        int i = 1;
        List<Appointment> list = new ArrayList<>();

        //simple iteration
        while(iterator.hasNext()){
            Appointment appointment = iterator.next();
            if ((appointment.isCompleted() == false) && (appointment.isScheduled() == true) && (appointment.getParticipant() == currentUser)){

                System.out.println(i + "." + "Appointment scheduled for " + appointment.getTimeslot().getDate() + " - " + appointment.getTimeslot().getTime() + "for ad " + appointment.getTimeslot().getAd().getTitle() + " with " + appointment.getTimeslot().getHost());
                i += 1;
                list.add(appointment);
            }
        }
        return list;
    }

    public List<Appointment> getCompletedAppointments(Private currentUser){

        Iterator<Appointment> iterator = this.list.iterator();

        int i = 1;
        List<Appointment> list = new ArrayList<>();

        System.out.println("Completed Appointments");

        //simple iteration
        while(iterator.hasNext()){
            Appointment appointment = iterator.next();
            if ((appointment.isCompleted() == true) && (appointment.getParticipant() == currentUser)){

                System.out.println(i + "." + appointment.getTimeslot().getHost() + "\nRequested" + appointment.getRequestedTimestamp() + "\nScheduled for " + appointment.getTimeslot().getDate() + " - " + appointment.getTimeslot().getTime() + "\nFor ad " + appointment.getTimeslot().getAd().getTitle());
                System.out.println("~~~~~~~~~~");
                i += 1;
                list.add(appointment);
            }
        }
        return list;
    }

    public List<Appointment> getAppointmentsByAd(PropertyManager currentUser, Ad selectedAd){

        Iterator<Appointment> iterator = this.list.iterator();

        int i = 1;
        List<Appointment> list = new ArrayList<>();

        //simple iteration
        while(iterator.hasNext()){
            Appointment appointment = iterator.next();
            if ((appointment.isCompleted() == false) && (appointment.isScheduled() == false) && (appointment.getTimeslot().getHost().getUsername().equals(currentUser.getUsername())) && (appointment.getTimeslot().getAd() == selectedAd)){

                System.out.println(i + "." + "New appointment request with " + appointment.getParticipant() + " for " + appointment.getTimeslot().getDate() + " - " + appointment.getTimeslot().getTime());
                i += 1;
                list.add(appointment);
            }
        }
        return list;
    }

    public List<Appointment> getScheduledAppointmentsByAd(PropertyManager currentUser, Ad selectedAd){

        Iterator<Appointment> iterator = this.list.iterator();

        int i = 1;
        List<Appointment> list = new ArrayList<>();

        //simple iteration
        while(iterator.hasNext()){
            Appointment appointment = iterator.next();
            if ((appointment.isCompleted() == false) && (appointment.isScheduled() == true) && (appointment.getTimeslot().getHost().getUsername().equals(currentUser.getUsername())) && (appointment.getTimeslot().getAd() == selectedAd)){

                System.out.println(i + "." + "Appointment scheduled for " + appointment.getTimeslot().getDate() + " - " + appointment.getTimeslot().getTime() + " with " + appointment.getParticipant());
                i += 1;
                list.add(appointment);
            }
        }
        return list;
    }

    public List<Appointment> getCompletedAppointmentsByAd(PropertyManager currentUser, Ad selectedAd){

        Iterator<Appointment> iterator = this.list.iterator();

        int i = 1;
        List<Appointment> list = new ArrayList<>();

        //simple iteration
        while(iterator.hasNext()){
            Appointment appointment = iterator.next();
            if ((appointment.isCompleted() == true) && (appointment.getTimeslot().getHost().getUsername().equals(currentUser.getUsername())) && (appointment.getTimeslot().getAd() == selectedAd)){

                System.out.println(i + "." + appointment.getParticipant() + "\nRequested" + appointment.getRequestedTimestamp() + "\nScheduled for " + appointment.getTimeslot().getDate() + " - " + appointment.getTimeslot().getTime());
                System.out.println("~~~~~~~~~~");
                i += 1;
                list.add(appointment);
            }
        }
        return list;
    }
}
