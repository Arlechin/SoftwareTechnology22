import java.time.LocalDateTime;
import java.util.*;


public class Applications {

    private LocalDateTime timeOfApplication;
    private Private senderOfApplication;
    private PropertyManager recipientOfApplication;

    private double priceApplied;

    private boolean withInstallments;

    private String appComments;
    private Ad adSelected;

    public Applications(Private senderOfApplication, PropertyManager recipientOfApplication,Ad adSelected, double priceApplied, boolean withInstallments, String appComments) {
        this.timeOfApplication = LocalDateTime.now();
        this.senderOfApplication = senderOfApplication;
        this.recipientOfApplication = recipientOfApplication;
        this.priceApplied = priceApplied;
        this.withInstallments = withInstallments;
        this.appComments = appComments;
        this.adSelected = adSelected;

    }
    public double getPriceApplied(){
        return this.priceApplied;
    }

    public PropertyManager getRecipientOfApplication(){
        return this.recipientOfApplication;
    }

    public Private getSenderOfApplication() {return this.senderOfApplication; }

    public Ad getAdSelected() {
        return adSelected;
    }

    public boolean isWithInstallments() {
        return withInstallments;
    }

    public String getAppComments() {
        return appComments;
    }

    public Ad selectAd(List<Ad> adsList) {
        adSelected  = adsList.get(0);
        return adSelected;
    }
}
