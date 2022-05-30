import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
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

    public static void fillAdsList(List<Ad> adsList, List<Property> featuredPropertiesList, List<Broker> ownersList){

        Ad ad = new Ad("For Rent 1","Rent","Some text",null,null,featuredPropertiesList.get(0),LocalDateTime.now(),2100,1000, false,false, ownersList.get(0));
        adsList.add(ad);

        ad = new Ad("For Sale 2","Sale","Some text",null,null,featuredPropertiesList.get(1),LocalDateTime.now(),229000,4000, false,false, ownersList.get(0));
        adsList.add(ad);

        ad = new Ad("For Rent 3","Rent","Some text",null,null,featuredPropertiesList.get(2),LocalDateTime.now(),2800,1400, false,false, ownersList.get(0));
        adsList.add(ad);
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

    /* public static void fillScheduledAppointmentsList(List<Appointment> appointments){

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
    }*/

    public static void mainProgramPrivate(Private currentUser, List<Ad> adsList, List<Private> privatesList, List<Broker> brokersList, AppointmentsList appointmentsList, TimeslotsList timeslotsList){

        Scanner in = new Scanner(System.in); // Create scanner
        int option = 0; // Int input
        String input; // String input

        while (option != 7) {
            System.out.println("1.Home \n2.Drawer \n3.Messages \n4.Deals \n5.Offers \n6.Search \n7.Exit");
            option = Integer.parseInt(in.nextLine());

            switch (option) {
                case 1:
                    System.out.println("1.Favorite Ads");
                case 2:
                    System.out.println("2.Drawer \n 1.My Appointments");
                case 3:
                    System.out.println("3.Messages");
                case 4:
                    System.out.println("4.Deals");
                case 5:
                    System.out.println("5.Offers");
                case 6: {
                    System.out.println("6.Search");

                    //System.out.println("Enter search key...");
                    //input = in.nextLine();

                    //AdsList searchList = adsList.searchInAds(input);

                    //searchList.printList();
                    System.out.println("Search completed and private has chosen an ad.");
                    Ad selectedAd = adsList.get(1);

                    System.out.println(selectedAd.getTitle() + " - " + selectedAd.getAdType());
                    System.out.println("Description: " + selectedAd.getDescription());
                    System.out.println("Price: " + selectedAd.getPrice() + " + Brokerage fee: " + selectedAd.getBrokerageFee());
                    System.out.println("Address: " + selectedAd.getFeaturedProperty().getAddress() + " ,Neighbourhood: " + selectedAd.getFeaturedProperty().getNeighborhood());

                    System.out.println("\n1.More info \n2.Contact \n3.Appointment");
                    option = Integer.parseInt(in.nextLine());

                    if (option == 3) {
                        Appointment appointment = appointmentsList.searchInAppointments(selectedAd, currentUser);
                        if (appointment == null) {

                            System.out.println("Select a timeslot:");
                            List<Timeslot> list = timeslotsList.getAvailable(selectedAd);
                            option = Integer.parseInt(in.nextLine());
                            appointment = list.get(option-1).selectAvailableTimeslot(currentUser);
                            appointmentsList.save(appointment);
                        } else {

                            System.out.println("You have already scheduled an appointment for this ad. What do you want to do?");
                            System.out.println("1.Back \n2.Manage appointment");
                            option = Integer.parseInt(in.nextLine());
                        }
                    }
                    break;
                }
                case 7: {
                    System.out.println("7.Exit");
                }
            }
        }
    }

    public static void mainProgramBroker(Broker currentUser, List<Ad> adsList, List<Private> privatesList, List<Broker> brokersList, AppointmentsList appointmentsList, TimeslotsList timeslotsList){

        Scanner in = new Scanner(System.in); // Create scanner
        int option; // Int input
        String input; // String input

        System.out.println("1.Home \n2.Drawer \n3.Messages \n4.Deals \n5.Offers \n6. Search");
        option = Integer.parseInt(in.nextLine());

        switch (option){
            case 1:
                System.out.println("Recently Added Ads");
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
            }
        }
    }

    public static void main(String[] args) {

        // Starter properties for testing
        List<Property> propertiesList = new ArrayList<>();
        fillPropertiesList(propertiesList);

        // Starter privates for testing
        List<Private> privatesList = new ArrayList<>();
        fillPrivatesList(privatesList);

        // Starter brokers for testing
        List<Broker> brokersList = new ArrayList<>();
        fillBrokersList(brokersList);

        // Starter ads for testing
        List<Ad> adsList = new ArrayList<>();
        fillAdsList(adsList, propertiesList, brokersList);

        // Initialize available appointments list
        TimeslotsList timeslotsList = new TimeslotsList(adsList);

        // Starter appointments for testing
        AppointmentsList appointmentsList = new AppointmentsList();

        // Initialize scanner for user input
        Scanner in = new Scanner(System.in);
        String inputUsername; // String input
        String inputPassword; // String input
        String inputRole;

        // Log In
        boolean logInFailed = true;

        while (logInFailed == true) {

            System.out.println("Role: (Private or Broker)");
            inputRole = in.nextLine();

            if (inputRole.equals("Private")) {

                System.out.println("Username:");
                inputUsername = in.nextLine();

                System.out.println("Password:");
                inputPassword = in.nextLine();

                Iterator<Private> iterator = privatesList.iterator();

                //simple iteration
                while (iterator.hasNext()) {
                    Private private1 = iterator.next();
                    if (private1.getUsername().equals(inputUsername)) {
                        if (private1.getPassword().equals(inputPassword)) {
                            System.out.println("You are logged in!");
                            logInFailed = false;
                            mainProgramPrivate(private1,adsList,privatesList,brokersList, appointmentsList, timeslotsList);
                            break;
                        }
                        else {
                            logInFailed = true;
                        }
                    }
                    else {
                        logInFailed = true;
                    }
                }
                if (logInFailed == true){
                    System.out.println("Log in failed! Try again...");
                }
            }
            else if (inputRole.equals("Broker")) {

                System.out.println("Username:");
                inputUsername = in.nextLine();

                System.out.println("Password:");
                inputPassword = in.nextLine();

                Iterator<Broker> iterator = brokersList.iterator();

                //simple iteration
                while (iterator.hasNext()) {
                    Broker broker = iterator.next();
                    if (broker.getUsername().equals(inputUsername)) {
                        if (broker.getPassword().equals(inputPassword)) {
                            System.out.println("You are logged in!");
                            logInFailed = false;
                            mainProgramBroker(broker,adsList,privatesList,brokersList, appointmentsList, timeslotsList);
                            break;
                        }
                        else {
                            logInFailed = true;
                        }
                    }
                    else {
                        logInFailed = true;
                    }
                }
                if (logInFailed == true){
                    System.out.println("Log in failed! Try again...");
                }
            }
        }
    }
}