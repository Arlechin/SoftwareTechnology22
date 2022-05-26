import java.time.LocalDateTime;


public class User {

    // Attributes

    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private LocalDateTime dateOfRegistration;

    public User(String username, String password, String email, String phoneNumber, LocalDateTime dateOfRegistration){
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfRegistration = dateOfRegistration;
    } // Constructor

    // Methods

}
