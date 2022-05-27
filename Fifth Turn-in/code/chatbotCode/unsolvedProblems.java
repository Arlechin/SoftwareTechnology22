import java.util.Scanner; 
public class unsolvedProblems
{

    /**
     * Κατασευαστής αντικειμένων της κλάσης solvedProblems
     */
    public unsolvedProblems()
    {
        String[] problems = {"Peiraios Bank e-POS is out of order", "Received a message saying transaction terminated error 808", "Address doesn't show properly on the map of the Ad", "Error accepting the e-mail address"} ; 
    
}
    
    public void  searchUnsolvedProblems(String  p)
    {
        if (p=="payment"){
            System.out.println(problems[0]);
            j=0;
        }
         else if (p=="paymentreceive"){
            System.out.println(problems[1]);
            j=1;
        }
         else if (p=="post"){
            System.out.println(problems[2]);
            j=2;
        }
         else if (p=="payment"){
            System.out.println(problems[3]);
            j=3;
    }
    System.out.println("Is this your problem? Choose one of the numbers for the options below");
     System.out.println("1)Yes 2)No");
        Scanner checkproblem = new Scanner(System.in);  // Create a Scanner object
        String problemanswer = checkproblem.nextLine();  // Read user input
        if (problemanswer="1"){
        System.out.println("Our team is already working hard to resolve your problem");
        } else {
            System.out.println("Redirecting you to a human");
            Chatbot.chat();
        }

    Chatbot.moreProblems();}
}
