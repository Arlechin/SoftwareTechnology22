import java.time.LocalDateTime;

public class PropertyManager extends User {

    // Attributes

    private Boolean marked;
    private int numberOfAdsUploaded;
    private int numberOfRatings;
    private float totalRating;

    public PropertyManager(String username, String password, String email, String phoneNumber, LocalDateTime dateOfRegistration, Boolean marked, int numberOfAdsUploaded, int numberOfRatings, float totalRating){
        super(username, password, email, phoneNumber, dateOfRegistration);
        this.marked = marked;
        this.numberOfAdsUploaded = numberOfAdsUploaded;
        this.numberOfRatings = numberOfRatings;
        this.totalRating = totalRating;
    } // Constructor

    // Methods

    public void requestFieldFilling(){

    }

    public void update(){

    }

    public void verifyOfferRegistration(){

    }

    public void view(){

    }

    public void proposeDeal(){

    }
}
