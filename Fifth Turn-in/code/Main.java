import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void fillPropertiesList(List<Property> propertiesList){

        Property property = new Property(2002,"Detached house","Undefined","Ano Kifisia - Kifisia, Attiki","3","Ground floor","B+","South west","Autonomous - Natural gas","No", 1,1,"Double phase",true,"Urban development",140,true);
        propertiesList.add(property);

        property = new Property(2014,"Apartment","Undefined","Ano Glyfada - Glyfada, Attiki","3","3","A","North east","Autonomous - Natural gas","Yes", 4,2,"Double phase",true,"Urban development",120,true);
        propertiesList.add(property);

        property = new Property(2019,"Apartment","Undefined","Kato Chalandri - Chalandri, Attiki","2","4","A+","South east","Autonomous - Natural gas","Yes", 6,2,"Double phase",true,"Urban development",110,true);
        propertiesList.add(property);
    }

    public static void fillAdsList(AdsList adsList, List<Property> featuredPropertiesList){

        Ad ad = new Ad("For Rent 1","Rent","Some text",null,null,featuredPropertiesList.get(0),LocalDateTime.now(),2100,1000, false,false);
        adsList.add1(ad);

        ad = new Ad("For Sale 2","Sale","Some text",null,null,featuredPropertiesList.get(1),LocalDateTime.now(),229000,4000, false,false);
        adsList.add1(ad);

        ad = new Ad("For Rent 3","Rent","Some text",null,null,featuredPropertiesList.get(2),LocalDateTime.now(),2800,1400, false,false);
        adsList.add1(ad);
    }

    public static void fillPrivatesList(List<Private> privatesList){

        Private private1 = new Private("iLazarou","il12345","ilazarou@example.com","6981111111",LocalDateTime.now());
        privatesList.add(private1);

        private1 = new Private("kMichail","km12345","kmichail@example.com","6982222222",LocalDateTime.now());
        privatesList.add(private1);

        private1 = new Private("gGeorgiou","gg12345","ggeorgiou@example.com","6983333333",LocalDateTime.now());
        privatesList.add(private1);

        private1 = new Private("sAndreadis","sa12345","sandreadis@example.com","6984444444",LocalDateTime.now());
        privatesList.add(private1);
    }

    public static void fillBrokersList(List<Broker> brokersList){

        Broker broker = new Broker("JohnFradis","jf12345","jf@example.com","210 9111111", LocalDateTime.now(), true,"JF Realty");
        brokersList.add(broker);

        broker = new Broker("MariosIakovou","cp12345","cp@example.com","210 9222222", LocalDateTime.now(), true,"Colossal Properties");
        brokersList.add(broker);

        broker = new Broker("KristiAdami","pp12345","pp@example.com","210 9333333", LocalDateTime.now(), true,"Prosper Properties");
        brokersList.add(broker);
    }

    public static void fillScheduledAppointmentsList(List<ScheduledAppointment> scheduledAppointmentsList){

        // Local variables
        PropertyManager host;
        String timeslot;
        Private participant;
        String meetingSpot;

        // First scheduled appointment
        host = new PropertyManager("JohnFradis","jf12345","jf@example.com","210 9111111", LocalDateTime.now());
        timeslot = "9-10";
        participant = new Private("iLazarou","il12345","ilazarou@example.com","6981111111",LocalDateTime.now());
        meetingSpot = "Ethnikis Antistaseos 48 and Serron 19 corner";
        //ScheduledAppointment scheduledAppointment = new ScheduledAppointment(host ,timeslot, participant, meetingSpot);

        //scheduledAppointmentsList.add(scheduledAppointment);
    }
    public static void main(String[] args) {

        // Starter properties for testing
        List<Property> propertiesList = new ArrayList<>();
        fillPropertiesList(propertiesList);

        // Starter ads for testing
        AdsList adsList = new AdsList();
        fillAdsList(adsList, propertiesList);

        // Starter privates for testing
        List<Private> privatesList = new ArrayList<>();
        fillPrivatesList(privatesList);

        // Starter brokers for testing
        List<Broker> brokersList = new ArrayList<>();
        fillBrokersList(brokersList);

        // Starter scheduled appointments for testing
        /*List<ScheduledAppointment> scheduledAppointmentsList = new ArrayList<>();
        fillScheduledAppointmentsList(scheduledAppointmentsList);*/

        // Initialize scanner for user input
        Scanner in = new Scanner(System.in);
        int option; // Int input
        String input; // String input

        // Main program
        System.out.println("1.Home \n2.Drawer \n3.Messages \n4.Deals \n5.Offers \n6. Search");
        option = Integer.parseInt(in.nextLine());

        switch (option){
            case 1:
                System.out.println("Favorite Ads"); // se function anti se ui class (convention)
            case 2:
                System.out.println("Drawer \n 1.My Appointments");
            case 3:
                System.out.println("Messages");
            case 4:
                System.out.println("Deals");
            case 5:
                System.out.println("Offers");
            case 6: {
                System.out.println("Search");

                System.out.println("Enter search key...");
                input = in.nextLine();

                AdsList searchList = adsList.searchInAds(input);

                searchList.printList();
                System.out.println("1.More info \n2.Contact \n3.Appointment");
                option = Integer.parseInt(in.nextLine());
                //availableAppointments =
            }

        }
    }
}