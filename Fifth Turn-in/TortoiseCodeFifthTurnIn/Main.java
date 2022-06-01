import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void UITimeslotsPage(Appointment appointment, Ad selectedAd, AppointmentsList appointmentsList, TimeslotsList timeslotsList, Private currentUser){

        int option;
        Scanner in = new Scanner(System.in); // Create scanner

        if (appointment == null) {

            System.out.println("Select a timeslot:");
            List<Timeslot> list = timeslotsList.getAvailable(selectedAd);
            option = Integer.parseInt(in.nextLine());
            appointment = list.get(option-1).selectAvailableTimeslot(currentUser);
            appointmentsList.save(appointment);
        } else // UIAppointmentWarning
        {

            System.out.println("You have already scheduled an appointment for this ad. What do you want to do?");
            System.out.println("1.Back \n2.Manage appointment");
            option = Integer.parseInt(in.nextLine());
            if (option == 2){
                // Manage appointments
            }
        }
    }

    public static void fillPropertyManagerList(List<PropertyManager> propertyManagerList){
        PropertyManager propertyManager = new PropertyManager("hBoutton", "hb12345", "hbouton@example.com","6971111111", LocalDateTime.now());
        propertyManagerList.add(propertyManager);

        propertyManager = new PropertyManager("lVouitton", "lb12345", "lvouitton@example.com", "6972222222", LocalDateTime.now());
        propertyManagerList.add(propertyManager);

        propertyManager = new PropertyManager("jpGaultier", "jpg12345", "jpgaultier@example.com", "6973333333", LocalDateTime.now());
        propertyManagerList.add(propertyManager);
    }
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

    /*public static void fillOfferApplicationsList(List<Applications> applicationsList, List<Private> privatesList, List<PropertyManager> propertyManagerList,List<Ad> adsList){
        Applications application = new Applications(privatesList.get(0), propertyManagerList.get(2),adsList.get(0));
        applicationsList.add(application);

        application = new Applications(privatesList.get(1), propertyManagerList.get(1),adsList.get(1));
        applicationsList.add(application);

        application = new Applications(privatesList.get(2), propertyManagerList.get(0),adsList.get(2));
        applicationsList.add(application);
    }*/

   /* public static void fillAvailableOffersList(AvailableOffersList availableOffersList, List<Private> privatesList, List<PropertyManager> propertyManagerList,List<Ad> adsList,){
        double priceApplied = 0;
        boolean withInstallments = false;
        String appComments = "";
        Offer availableOffer = new Offer(privatesList.get(0), propertyManagerList.get(1), adsList.get(0), priceApplied, withInstallments, appComments);
        availableOffersList.add1(availableOffer);

        availableOffer = new Offer(privatesList.get(1), propertyManagerList.get(1),adsList.get(1));
        availableOffersList.add1(availableOffer);

        availableOffer = new Offer(privatesList.get(2), propertyManagerList.get(0),adsList.get(2));
        availableOffersList.add1(availableOffer);
    } */

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


    public static Offer MakeAnOffer(Private privateCreatingOffer, PropertyManager PMRecipientOfOffer, Ad selectedAD, List<Applications> applicationsList, List<Private> privatesList, List<PropertyManager> propertyManagerList, AvailableOffersList availableOffersList) {



        int fieldFlag1 = 0;
        double priceApplied;
        Boolean withInstallments;
        String appComments;

        System.out.println("Please fill required fields");
        Scanner in = new Scanner(System.in);

        System.out.println("Please fill price");
        priceApplied = Double.parseDouble(in.nextLine());

        System.out.println("With installments? true/false");
        withInstallments = Boolean.parseBoolean(in.nextLine());

        System.out.println("Please type your comments");
        appComments = in.nextLine();

        Offer offer0 = null;
        if((priceApplied != 0 ) && (withInstallments != null) && (appComments != null)) {
            Applications application0 = new Applications(ourPrivate, selectedAD.getOwner(), selectedAD, priceApplied, withInstallments, appComments);

            offer0 = new Offer(ourPrivate, application0.getRecipientOfApplication(), application0.getAdSelected(), application0.getPriceApplied(), application0.isWithInstallments(), application0.getAppComments());

            assert offer0 != null;
            Boolean isOfferVerified = offer0.checkForOfferVerification();
            if(isOfferVerified) {
                availableOffersList.add1(offer0);
                System.out.println("New offer successfully added to available offers list.");
            }

        }   return offer0;
    }

    public static Private ourPrivate = new Private("", "", "", "", LocalDateTime.now());
    public static void mainProgramPrivate(Private currentUser, List<Ad> adsList, List<Private> privatesList, List<Broker> brokersList, AppointmentsList appointmentsList, TimeslotsList timeslotsList, List<PropertyManager> propertyManagerList, List<Applications> applicationsList, AvailableOffersList availableOffersList ){

        Scanner in = new Scanner(System.in); // Create scanner
        int option = 0; // Int input
        String input; // String input

        while (option != 7) {
            System.out.println("1.Home \n2.Drawer \n3.Messages \n4.Deals \n5.Offers \n6.Search \n7.Exit");
            option = Integer.parseInt(in.nextLine());

            switch (option) {
                case 1: {
                    System.out.println("Favorite Ads");
                    break;
                }
                case 2: {
                    System.out.println("Drawer \n0.My Appointments");
                    option = Integer.parseInt(in.nextLine());

                    if (option == 0){

                        boolean back = false;

                        while (back == false) {
                            System.out.println("Select an appointment request or select 0 for more options:");
                            List<Appointment> list = appointmentsList.getAppointments(currentUser);

                            if (list.isEmpty()) {
                                System.out.println("No appointment requests for the moment. Select 0 for more options.");
                            }

                            option = Integer.parseInt(in.nextLine());
                            if (option == 0) {
                                System.out.println("1.Scheduled appointments \n2.Completed appointments \n3.Back");
                                // 1 -> Manage appointments
                                // 2 -> Browse completed appointments and leave a review
                                // 3 -> Back to menu
                                option = Integer.parseInt(in.nextLine());
                                if ((option == 1) || (option == 2)) {
                                    System.out.println("Selected function not available for the moment. Going back to main menu...");
                                }
                                back = true;
                            }
                            else {
                                Appointment selectedAppointment = list.get(option - 1);

                                if (selectedAppointment.isAlternative() == false) {
                                    System.out.println("Waiting for confirmation...");
                                    System.out.println("Do you want to delete appointment request? \n 1.Yes     2.No");
                                    option = Integer.parseInt(in.nextLine());
                                    if (option == 1){
                                        appointmentsList.delete(selectedAppointment);
                                    }
                                }
                                else {
                                    System.out.println("1.Verify appointment \n2.Propose an alternative timeslot \n3.Delete appointment \n4.Back");
                                    option = Integer.parseInt(in.nextLine());
                                    if (option == 1) {
                                        selectedAppointment.setScheduled(true);
                                    }
                                    else if (option == 2) {
                                        appointmentsList.delete(selectedAppointment);
                                        UITimeslotsPage(null, selectedAppointment.getTimeslot().getAd(), appointmentsList, timeslotsList, currentUser);
                                    }
                                    else if (option == 3){
                                        appointmentsList.delete(selectedAppointment);
                                    }
                                    else {
                                        back = true;
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Messages");
                    break;
                }
                case 4: {
                    System.out.println("Deals");
                    break;
                }
                case 5: {
                    System.out.println("Offers");
                    break;
                }
                case 6: {
                    System.out.println("Search");

                    System.out.println("Search completed and private has chosen an ad.");
                    Ad selectedAd = adsList.get(0);

                    System.out.println(selectedAd.getTitle() + " - " + selectedAd.getAdType());
                    System.out.println("Description: " + selectedAd.getDescription());
                    System.out.println("Price: " + selectedAd.getPrice() + " + Brokerage fee: " + selectedAd.getBrokerageFee());
                    System.out.println("Address: " + selectedAd.getFeaturedProperty().getAddress() + " ,Neighbourhood: " + selectedAd.getFeaturedProperty().getNeighborhood());

                    System.out.println("\n1.More info \n2.Contact \n3.Appointment");
                    option = Integer.parseInt(in.nextLine());

                    if (option == 3) {
                        Appointment appointment = appointmentsList.searchInAppointments(selectedAd, currentUser);
                        UITimeslotsPage(appointment,selectedAd,appointmentsList,timeslotsList,currentUser);
                    }
                    break;
                }
                case 7: {
                    System.out.println("Exit");
                }
            }
            if(option == 5) {
                System.out.println("Please select an Ad");
                Applications application = new Applications(privatesList.get(0), propertyManagerList.get(2),adsList.get(0),0,false,"");
                Ad adSelected=application.selectAd(adsList);
                if(availableOffersList.getAvailableOfferList().isEmpty()){
                    System.out.println("List of available offers is empty.");
                    Offer ourOffer = MakeAnOffer(ourPrivate, application.getRecipientOfApplication(), adSelected, applicationsList, privatesList, propertyManagerList, availableOffersList);
                    String textToPM = "";
                    Update updateToPM = new Update(ourPrivate, application.getRecipientOfApplication(), LocalDateTime.now(),adSelected, textToPM);
                    updateToPM.updateOnNewOffer(ourPrivate,ourOffer);
                }else{
                    availableOffersList.printList();
                    System.out.println("Do you fancy any of the above Offers? Type the desired offer's number or type 0 if you are not interested at all.");
                    int adNumber = Integer.parseInt(in.nextLine());
                    if(adNumber==0){
                        Offer ourOffer = MakeAnOffer(ourPrivate, application.getRecipientOfApplication(), adSelected, applicationsList, privatesList, propertyManagerList, availableOffersList);
                        String textToPM = "";
                        Update updateToPM = new Update(ourPrivate, application.getRecipientOfApplication(), LocalDateTime.now(),adSelected, textToPM);
                        updateToPM.updateOnNewOffer(ourPrivate,ourOffer);
                    }else {
                        System.out.println("Type a message to the property manager about the offer you selected.");
                        String textToPM = in.nextLine();
                        Update updateToPM = new Update(ourPrivate, application.getRecipientOfApplication(), LocalDateTime.now(),adSelected, textToPM);
                        updateToPM.updateOnInterestedParty(ourPrivate, textToPM);
                    }
                }
            }
        }
    }

    public static void mainProgramBroker(Broker currentUser, List<Ad> adsList, List<Private> privatesList, List<Broker> brokersList, AppointmentsList appointmentsList, TimeslotsList timeslotsList){

        Scanner in = new Scanner(System.in); // Create scanner
        int option = 0; // Int input
        String input; // String input

        while (option != 7) {

            System.out.println("1.Home \n2.Drawer \n3.Messages \n4.Deals \n5.Offers \n6.Search \n7.Exit");
            option = Integer.parseInt(in.nextLine());

            switch (option) {
                case 1: {
                    System.out.println("Recently Added Ads");
                    break;
                }
                case 2: {
                    System.out.println("Drawer");

                    boolean back = false;

                    while (back == false) {

                        Iterator<Ad> iterator = adsList.iterator();

                        int i = 1;
                        List<Ad> brokersAdsList = new ArrayList<>();

                        //simple iteration
                        while (iterator.hasNext()) {
                            Ad ad = iterator.next();
                            if (ad.getOwner() == currentUser) {

                                if (ad.getFeaturedProperty().availableProperty() == true) {

                                    System.out.println(i + "." + ad.getTitle() + " - " + ad.getAdType());
                                    System.out.println("Description: " + ad.getDescription());
                                    System.out.println("Price: " + ad.getPrice() + " + Brokerage fee: " + ad.getBrokerageFee());
                                    System.out.println("Address: " + ad.getFeaturedProperty().getAddress() + " ,Neighbourhood: " + ad.getFeaturedProperty().getNeighborhood());

                                    i += 1;
                                    brokersAdsList.add(ad);
                                }
                            }
                        }

                        System.out.println("Select an ad or select 0 to go back:");
                        option = Integer.parseInt(in.nextLine());

                        if (option == 0) {
                            back = true;
                        }
                        else {
                            Ad selectedAd = brokersAdsList.get(option - 1);

                            boolean backToAdSelection = false;

                            while (backToAdSelection == false) {

                                System.out.println("Select an appointment request or select 0 for more options:");
                                List<Appointment> list = appointmentsList.getAppointmentsByAd(currentUser, selectedAd);

                                if (list.isEmpty()) {
                                    System.out.println("No appointment requests for the moment. Select 0 for more options.");
                                }

                                option = Integer.parseInt(in.nextLine());

                                if (option == 0) {
                                    System.out.println("1.Scheduled appointments \n2.Completed appointments \n3.Back");
                                    // 1 -> Manage appointments
                                    // 2 -> Browse completed appointments
                                    // 3 -> Back to menu
                                    option = Integer.parseInt(in.nextLine());
                                    if ((option == 1) || (option == 2)) {
                                        System.out.println("Selected function not available for the moment. Going back to main menu...");
                                    }
                                    backToAdSelection = true;
                                } else {
                                    Appointment selectedAppointment = list.get(option - 1);

                                    System.out.println("1.Add meeting spot and verify appointment \n2.Propose an alternative timeslot \n3.Delete appointment \n4.Back");
                                    option = Integer.parseInt(in.nextLine());
                                    if (option == 1) {
                                        System.out.println("Meeting spot:");
                                        input = in.nextLine();
                                        selectedAppointment.setMeetingSpot(input);
                                        selectedAppointment.setScheduled(true);
                                    } else if (option == 2) {
                                        System.out.println("Select a timeslot:");
                                        List<Timeslot> timeslots = timeslotsList.getAvailable(selectedAd);
                                        option = Integer.parseInt(in.nextLine());
                                        Timeslot selectedTimeslot = timeslots.get(option - 1);
                                        selectedAppointment.updateTimeslot(selectedAppointment.getTimeslot(), selectedTimeslot);

                                        System.out.println("Meeting spot:");
                                        input = in.nextLine();
                                        selectedAppointment.setMeetingSpot(input);

                                        selectedAppointment.setAlternative();
                                    } else if (option == 3) {
                                        appointmentsList.delete(selectedAppointment);
                                    } else {
                                        backToAdSelection = true;
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Messages");
                    break;
                }
                case 4: {
                    System.out.println("Deals");
                    break;
                }
                case 5: {
                    System.out.println("Offers");
                    break;
                }
                case 6: {
                    System.out.println("Search");
                    break;
                }
                case 7: {
                    System.out.println("Exit");
                }
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

        List<PropertyManager> propertyManagerList = new ArrayList<>();
        fillPropertyManagerList(propertyManagerList);

        List<Applications> applicationsList = new ArrayList<>();
        //fillOfferApplicationsList(applicationsList, privatesList, propertyManagerList, adsList);

        AvailableOffersList availableOffersList = new AvailableOffersList();
        //fillAvailableOffersList(availableOffersList, privatesList, propertyManagerList, adsList);
        // Initialize available appointments list
        TimeslotsList timeslotsList = new TimeslotsList(adsList);

        // Starter appointments for testing
        AppointmentsList appointmentsList = new AppointmentsList();

        // Initialize scanner for user input
        Scanner in = new Scanner(System.in);
        String inputUsername; // String input
        String inputPassword; // String input
        String inputRole;
        int option;

        // Log In
        boolean logInFailed = true;
        boolean logIn = false;

        while (logInFailed || logIn) {

            logIn = false;
            logInFailed = true;

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
                            ourPrivate = private1;
                            logInFailed = false;
                            mainProgramPrivate(private1, adsList, privatesList, brokersList, appointmentsList, timeslotsList, propertyManagerList, applicationsList, availableOffersList);
                            System.out.println("Sign in again?\n1.Yes    2.No");
                            option = Integer.parseInt(in.nextLine());
                            if (option == 1) {
                                logIn = true;
                            }
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
                            System.out.println("Sign in again?\n1.Yes    2.No");
                            option = Integer.parseInt(in.nextLine());
                            if (option == 1) {
                                logIn = true;
                            }
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