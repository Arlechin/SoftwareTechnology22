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


    public List<Appointment> getList() {
        return list;
    }

    public Appointment searchInAppointments(Ad relatedAd, Private participant){

        Iterator<Appointment> iterator = this.list.iterator();

        //simple iteration
        while(iterator.hasNext()){
            Appointment appointment = iterator.next();
            if (appointment.getParticipant() == participant || appointment.getTimeslot().getAd() == relatedAd) {
                return appointment;
            }
        }
        return null;
    }

    public void save(Appointment appointment){
        this.list.add(appointment);
    }

    public void delete(Appointment appointment){
        this.list.remove(appointment);
    }
}
