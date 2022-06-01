import java.time.LocalDateTime;
import java.util.List;

public class Private extends PropertyManager {

    // Attributes

    private int numberOfReviews;
    private int numberOfPublishedReviews;
    private List<Ad> reportedAds;

    public Private(String username, String password, String email, String phoneNumber, LocalDateTime dateOfRegistration){
        super(username, password, email, phoneNumber, dateOfRegistration);
        this.numberOfReviews = 0;
        this.numberOfPublishedReviews = 0;
    } // Constructor

    // Methods

    public void requestOfferVerification(){

    }

    public void acceptDeal(){

    }
}
