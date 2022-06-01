import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdsList {

    // Attributes

    List<Ad> list;

    public AdsList(){
        list = new ArrayList<>();
    }

    public void add1 (Ad ad){
        this.list.add(ad);
    }

    public void printList(){

        Iterator<Ad> iterator = this.list.iterator();
        int counter = 1;

        //simple iteration
        while(iterator.hasNext()){
            Ad ad = iterator.next();
            if (ad.getFeaturedProperty().availableProperty() == true){
                System.out.println(counter + ". " + ad.getTitle() + " - " + ad.getAdType());
                System.out.println("Description: " + ad.getDescription());
                System.out.println("Price: " + ad.getPrice() + " + Brokerage fee: " + ad.getBrokerageFee());
                System.out.println("Address: " + ad.getFeaturedProperty().getAddress() + " ,Neighbourhood: " + ad.getFeaturedProperty().getNeighborhood());
            }
            counter += 1;
        }
    }

    public AdsList searchInAds(String inputString){

        Iterator<Ad> iterator = this.list.iterator();
        AdsList searchAdList = new AdsList();

        //simple iteration
        while(iterator.hasNext()){
            Ad ad = iterator.next();
            if (ad.getTitle().contains(inputString) || ad.getAdType().contains(inputString) || ad.getDescription().contains(inputString)) {
                searchAdList.add1(ad);
            }
        }
        return searchAdList;
    }

}
