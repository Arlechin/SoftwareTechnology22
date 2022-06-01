import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TimeslotsList {

    // Attributes

    private List<Timeslot> list = new ArrayList<>();

    public TimeslotsList(List<Ad> adsList){

        LocalDate today = LocalDate.now();
        LocalDate localDate;
        String date;
        String timeSlot;

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

                    Timeslot availableAppointment = new Timeslot(adsList.get(k).getOwner(),date,timeSlot, adsList.get(k));
                    list.add(availableAppointment);
                }
            }
        }
    }

    public List<Timeslot> getAvailable(Ad ad){

        Iterator<Timeslot> iterator = this.list.iterator();

        int i = 1;
        List<Timeslot> list = new ArrayList<>();

        //simple iteration
        while(iterator.hasNext()){
            Timeslot timeslot = iterator.next();
            if ((timeslot.getAd() == ad) && (timeslot.isAvailable() == true)){
                System.out.println(i + "." + timeslot.getDate() + " - " + timeslot.getTime());
                i += 1;
                list.add(timeslot);
            }
        }
        return list;
    }

}
