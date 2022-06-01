import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AvailableOffersList {

    private List<Offer> availableOffersList;

    public AvailableOffersList(){
        this.availableOffersList = new ArrayList<>();
    }

    public void add1(Offer offer){
        this.availableOffersList.add(offer);
    }
    public List<Offer> getAvailableOfferList() {
        return this.availableOffersList;
    }

    public void printList(){

        Iterator<Offer> iterator = availableOffersList.iterator();
        int counter = 1;

        //simple iteration
        while(iterator.hasNext()){
            Offer offer = iterator.next();
            System.out.println(counter + ". " + offer.getAdSelected().getTitle() + " - " + offer.getAdSelected().getAdType());
            System.out.println("Description: " + offer.getAdSelected().getDescription());
            System.out.println("Price: " + offer.getPriceApplied());
            counter += 1;
        }
    }
}









