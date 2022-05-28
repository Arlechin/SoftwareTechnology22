import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AvailableAppointmentsList {

    // Attributes

    private List<AvailableAppointment> list = new ArrayList<>();

    public AvailableAppointmentsList(List<Ad> adsList){

        LocalDate today = LocalDate.now();
        LocalDate localDate;
        String date;
        String timeSlot;
        Ad ad;

        for (int k = 0; k < adsList.size(); k++) {

            for (int i = 0; i < 7; i++) {

                int base = 9;
                int from;
                int to;
                localDate = today.plusDays(i);
                date = localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

                for (int j = 0; j < 12; j++) {

                    from = base + j;
                    to = from + 1;
                    timeSlot = from + " - " + to;

                    AvailableAppointment availableAppointment = new AvailableAppointment(adsList.get(k).getOwner(),date,timeSlot, adsList.get(k));
                    list.add(availableAppointment);
                }
            }
        }
    }

    public void showAvailableAppointments(Ad ad){
        Iterator<AvailableAppointment> iterator = this.list.iterator();

        boolean found = false;
        int i = 1;

        //simple iteration
        while(iterator.hasNext()){
            AvailableAppointment availableAppointment = iterator.next();
            if (availableAppointment.getAd() == ad){
                System.out.println(i + "." + availableAppointment.getDate() + " - " + availableAppointment.getTimeslot());
                i += 1;
            }
        }
    }
}
