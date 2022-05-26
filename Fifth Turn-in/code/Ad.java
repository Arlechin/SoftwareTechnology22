import java.time.LocalDateTime;
import java.util.List;

public class Ad {

    // Attributes

    private String title;
    private String adType;
    private String description;
    private List<String> photos;
    private List<String> videos;
    private Property featuredProperty;
    private LocalDateTime dateOfUpload;
    private double price;
    private double brokerageFee;
    private List<User> reportedBy;
    private List<Private> likedBy;
    private boolean tour360Availability;
    private boolean virtualTourAvailability;

    public Ad(String title, String adType, String description, List<String> photos, List<String> videos, Property featuredProperty, LocalDateTime dateOfUpload, double price, double brokerageFee, List<User> reportedBy, List<Private> likedBy, boolean tour360Availability, boolean virtualTourAvailability){
        this.title = title;
        this.adType = adType;
        this.description = description;
        this.photos = photos;
        this.videos = videos;
        this.featuredProperty = featuredProperty;
        this.dateOfUpload = dateOfUpload;
        this.price = price;
        this.brokerageFee = brokerageFee;
        this.reportedBy = reportedBy;
        this.likedBy = likedBy;
        this.tour360Availability = tour360Availability;
        this.virtualTourAvailability = virtualTourAvailability;
    } // Constructor

    // Methods

    public boolean searchInReported(){
        return true;
    }

    public boolean availableProperty(){
        return true;
    }

    public boolean markAsReported(){
        return true;
    }

    public boolean markAsFavorite(){
        return true;
    }

    public boolean checkVirtualTourAvailability(){
        return true;
    }

    public boolean checkTour360Availability(){
        return true;
    }
}
