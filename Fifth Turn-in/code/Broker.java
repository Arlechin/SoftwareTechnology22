import java.time.LocalDateTime;

public class Broker extends PropertyManager {

    // Attributes

    private boolean certified;
    private String company;

    public Broker(String username, String password, String email, String phoneNumber, LocalDateTime dateOfRegistration, boolean marked, int numberOfAdsUploaded, int numberOfRatings, float totalRating, boolean certified, String company){
        super(username, password, email, phoneNumber, dateOfRegistration, marked, numberOfAdsUploaded, numberOfRatings, totalRating);
        this.certified = certified;
        this.company = company;
    } // Constructor

    // Methods
}
