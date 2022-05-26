import java.time.LocalDateTime;

public class Message extends DraftMessage {

    // Attributes

    private LocalDateTime dateSent;
    private boolean answered;
    private int event;

    public Message(String category, String body, Private sender, PropertyManager recipient, LocalDateTime dateSent, boolean answered, int event){
        super(category, body, sender, recipient);
        this.dateSent = dateSent;
        this.answered = answered;
        this.event = event;
    } // Constructor

    // Methods

    public void sendMessage(){

    }

    public void answerMessage(){

    }

    public void cancelContactProcess(){

    }

    public boolean checkForEvent(){
        return true;
    }

    public void registerEvent(){

    }

    public int checkNumberOfEvents(){
        return 1;
    }

    public boolean checkForEventsReset(){
        return true;
    }
}
