import java.time.LocalDateTime;

public class Payment {

    // Attributes

    private double sum;


    public Payment(double sum){
        this.sum = sum;
    }

    // Methods



    public void agreeWithDeal(Ad requestForAd){
        requestForAd.getFeaturedProperty().setAvailable(false);
    }

    public void denyDeal(Ad requestForAd){
        requestForAd.getFeaturedProperty().setAvailable(true);
        System.out.println("Deal denied.");
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
