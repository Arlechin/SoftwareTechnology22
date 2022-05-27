import java.util.Scanner; 
public class Chatbot
{
    public Chatbot()
    {
    
    }

    public void initialise()
    {
        System.out.println("Welcome to the Chatbot! How can we help you?");
        System.out.println("Please Select the corresponding numbers for one of the numbers for the options below");
        System.out.println("1)Accountant's Problem 2)Technical Problem 3)Chat with a Human");
        Scanner choice = new Scanner(System.in);  // Create a Scanner object
        String problem = choice.nextLine();  // Read user input
        if (problem == "1"){
            accountantProblem();
        } else if(problem=="2"){
            technicalProblem();
        } else if(problem=="3"){
            chat();
        } else { 
            System.out.println("Sorry didn't quite get that");
            initialise();
}
}
    public void accountantProblem(){
        System.out.println("Please be more specific. Choose one of the numbers for the options below");
        System.out.println("1)Problem Sending Money 2)Problem Receiving Money");
        Scanner accchoice = new Scanner(System.in);  // Create a Scanner object
        String accproblem = accchoice.nextLine();  // Read user input
        if (accproblem == "1"){
            paymentProblem();
        } else if(accproblem=="2"){
            paymentReceiveProblem();
        }
         else { 
            System.out.println("Sorry didn't quite get that");
            accountantProblem();
    }
}
public void paymentProblem(){
        System.out.println("We're looking for your problem!");
        solvedProblems.searchSolvedProblems(payment);
        unsolvedProblems.searchUnsolvedProblems(payment);

    }
public void paymentReceiveProblem(){
        System.out.println("We're looking for your problem!");
        solvedProblems.searchSolvedProblems(paymentreceive);
        unsolvedProblems.searchUnsolvedProblems(paymentreceive);

    }
    public void technicalProblem(){
        System.out.println("Please be more specific. Choose one of the numbers for the options below");
        System.out.println("1)Problem Posting an Ad 2)Problem Signing up");
        Scanner tecchoice = new Scanner(System.in);  // Create a Scanner object
        String tecproblem = tecchoice.nextLine();  // Read user input
        if (tecproblem == "1"){
            postProblem();
        } else if(tecproblem=="2"){
            signUpProblem();
        }
         else { 
            System.out.println("Sorry didn't quite get that");
            technicalProblem();
    }
}
public void postProblem(){
        System.out.println("We're looking for your problem!");
        solvedProblems.searchSolvedProblems(post);
        unsolvedProblems.searchUnsolvedProblems(post);
       

    }
public void signUpProblem(){
        System.out.println("We're looking for your problem!");
        solvedProblems.searchSolvedProblems(signup);
        unsolvedProblems.searchUnsolvedProblems(signup);

    }
        public void chat(){
        System.out.println("Passing you on to a human now");
        Employee.chat();
}
public void moreProblems(){
     System.out.println("Do you have more problems? Choose one of the numbers for the options below");
     System.out.println("1)Yes 2)No");
        Scanner moreproblems = new Scanner(System.in);  // Create a Scanner object
        String morechoices = moreproblems.nextLine();  // Read user input
        if (morechoices == "1"){
            initialise();
        } else if(morechoices=="2"){
            System.exit(0);
        }
         else { 
            System.out.println("Sorry didn't quite get that");
            moreProblems();
}
}