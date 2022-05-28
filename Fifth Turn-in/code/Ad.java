import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
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
    private List<Private> likedBy = new ArrayList<>();
    private boolean tour360Availability;
    private boolean virtualTourAvailability;

    public Ad(String title, String adType, String description, List<String> photos, List<String> videos, Property featuredProperty, LocalDateTime dateOfUpload, double price, double brokerageFee, boolean tour360Availability, boolean virtualTourAvailability){
        this.title = title;
        this.adType = adType;
        this.description = description;
        this.photos = photos;
        this.videos = videos;
        this.featuredProperty = featuredProperty;
        this.dateOfUpload = dateOfUpload;
        this.price = price;
        this.brokerageFee = brokerageFee;
        this.reportedBy = null;
        this.likedBy = null;
        this.tour360Availability = tour360Availability;
        this.virtualTourAvailability = virtualTourAvailability;
    } // Constructor

    // Methods

    public String getTitle(){
        return this.title;
    }

    public String getAdType(){
        return this.adType;
    }

    public String getDescription(){
        return this.description;
    }

    public List<String> getPhotos(){
        return this.photos;
    }

    public List<String> getVideos(){
        return this.videos;
    }

    public Property getFeaturedProperty(){
        return this.featuredProperty;
    }

    public LocalDateTime getDateOfUpload(){
        return this.dateOfUpload;
    }

    public double getPrice(){
        return price;
    }

    public double getBrokerageFee() {
        return brokerageFee;
    }

    public List<User> getReportedBy(){
        return reportedBy;
    }

    public List<Private> getLikedBy(){
        return likedBy;
    }

    public boolean checkVirtualTourAvailability(){
        return virtualTourAvailability;
    }

    public boolean checkTour360Availability(){
        return tour360Availability;
    }

    public boolean searchInReported(){
        return true;
    }

    public boolean markAsReported(){
        return true;
    }

    public boolean markAsFavorite(){

        return true;
    }


}
