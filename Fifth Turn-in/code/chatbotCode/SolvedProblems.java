import java.util.Scanner; 
public class SolvedProblems
{
    private int j;
     String[][] problems = { {"Peiraios Bank e-POS is out of order", "Received a message saying transaction terminated error 808", "Address doesn't show properly on the map of the Ad", "Error accepting the e-mail address"},
    {"Please wait for the bank to fix it or use a different card", "Refresh the page", "Edit the Ad after you post it inserting again the address", "Please don't use one-off email sevices"}} ; 
    
    /**
     * Κατασευαστής αντικειμένων της κλάσης solvedProblems
     */
    public void solvedProblems()
    {
       
}
    
    public void  searchSolvedProblems(String  p,Chatbot chatbot)
    {
        if (p=="payment"){
            System.out.println(problems[0][0]);
            j=0;
        }
         else if (p=="paymentreceive"){
            System.out.println(problems[0][1]);
            j=1;
        }
         else if (p=="post"){
            System.out.println(problems[0][2]);
            j=2;
        }
         else if (p=="payment"){
            System.out.println(problems[0][3]);
            j=3;
    }
    System.out.println("Is this your problem? Choose one of the numbers for the options below");
     System.out.println("1)Yes 2)No");
        Scanner checkproblem = new Scanner(System.in);  
        String problemanswer = checkproblem.nextLine();  
        if (problemanswer=="1"){
        System.out.println(problems[1][j]);
        chatbot.moreProblems();
        } else {
            System.out.println("Redirecting you to a human");
            chatbot.chat();
        }

    
}
}
