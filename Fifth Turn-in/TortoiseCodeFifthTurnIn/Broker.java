import java.time.LocalDateTime;

public class Broker extends PropertyManager {

    // Attributes

    private boolean certified;
    private String company;

    public Broker(String username, String password, String email, String phoneNumber, LocalDateTime dateOfRegistration, boolean certified, String company){
        super(username, password, email, phoneNumber, dateOfRegistration);
        this.certified = certified;
        this.company = company;
    } // Constructor

    // Methods
}
