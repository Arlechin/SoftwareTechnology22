import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Request {

    // Attributes

    private Private sender;
    private double sum;

    // Methods

    public void sendRequest(Ad requestForAd, List<Request> requests, List<Appointment> appointments){

        Iterator<Appointment> iterator = appointments.iterator();
        boolean found = false;

        //simple iteration
        while(iterator.hasNext()){
            Appointment appointment = iterator.next();
            if ((appointment.getParticipant() == this.sender) && (appointment.getTimeslot().getAd() == requestForAd) && (appointment.isCompleted() == true)){
                found = true;
                break;
            }
        }

        if(found == true){
            if(requests.contains(this) == false){
                System.out.println("Waiting for property manager to set payment");
                try {
                    wait(10);
                }
                catch (InterruptedException ex)
                {
                    ex.printStackTrace();
                }

                Random randomSum = new Random();
                int randomInt = randomSum.nextInt(800) +1;

                Payment payment = new Payment(randomInt);

                System.out.println("Payment: " + payment);
                Scanner in = new Scanner(System.in);
                String input; // String input

                System.out.println("Accept? Y,N");
                input = in.nextLine().toUpperCase();

                if (input.equals("Y")){
                    payment.agreeWithDeal(requestForAd);
                }
                else {
                    payment.denyDeal(requestForAd);
                }
            }
        }
        else{
            System.out.println("No completed appointment. Do you want to schedule an appointment? Y, N");
            Scanner in = new Scanner(System.in);
            String input; // String input

            input = in.nextLine();
            if (input == "Y"){
                UIAvailAppointmentPage(input);
            }
        }
    }

    private void UIAvailAppointmentPage(String input) {
    }

}
