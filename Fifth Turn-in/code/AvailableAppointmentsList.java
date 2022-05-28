import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

public class AvailableAppointmentsList {

    // Attributes

    private List<AvailableAppointment> list;

    public AvailableAppointmentsList(List<PropertyManager> propertyManagers){

        LocalDate today = LocalDate.now();
        LocalDate localDate;
        String date;
        String timeSlot;

        for (int k = 0; k < propertyManagers.size(); k++) {

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

                    AvailableAppointment availableAppointment = new AvailableAppointment(propertyManagers.get(k),date,timeSlot);
                    list.add(availableAppointment);
                }
            }
        }
    }
}
