import java.time.LocalDateTime;
import java.util.List;

public class Private extends PropertyManager {

    // Attributes

    private int numberOfReviews;
    private int numberOfPublishedReviews;
    private List<Ad> reportedAds;

    public Private(String username, String password, String email, String phoneNumber, LocalDateTime dateOfRegistration, boolean marked, int numberOfAdsUploaded, int numberOfRatings, float totalRating, int numberOfReviews, int numberOfPublishedReviews){
        super(username, password, email, phoneNumber, dateOfRegistration, marked, numberOfAdsUploaded, numberOfRatings, totalRating);
        this.numberOfReviews = numberOfReviews;
        this.numberOfPublishedReviews = numberOfPublishedReviews;
    } // Constructor

    // Methods

    public void requestOfferVerification(){

    }

    public void acceptDeal(){

    }
}
