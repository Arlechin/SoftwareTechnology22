import java.time.LocalDateTime;

public class PropertyManager extends User {

    // Attributes

    private Boolean marked;
    private int numberOfAdsUploaded;
    private int numberOfRatings;
    private float totalRating;

    public PropertyManager(String username, String password, String email, String phoneNumber, LocalDateTime dateOfRegistration){
        super(username, password, email, phoneNumber, dateOfRegistration);
        this.marked = false;
        this.numberOfAdsUploaded = 0;
        this.numberOfRatings = 0;
        this.totalRating = 0;
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
