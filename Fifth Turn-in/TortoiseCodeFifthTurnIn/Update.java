import java.time.LocalDateTime;

public class Update extends AvailableOffersList {

	protected Private sender;
	protected LocalDateTime dateSent;
	protected PropertyManager recipient;
	protected String updateText;

	protected Ad adSelected;


	public Update(Private sender, PropertyManager recipient, LocalDateTime dateSent, Ad adSelected, String updateText) {
		super();
		this.updateText = "";
		this.dateSent = LocalDateTime.now();

	}

	public void updateOnCounterOffer() {

	}

	public void updateOnAcceptance() {

	}

	public void updateOnRefusal() {

	}

	public void updateOnMissingFields() {

	}

	public void updateOnEmptyList() {

	}

	public void updateOnFluctuation() {

	}

	public void updateOnNewOffer(Private sender, Offer offerSelected) {
		System.out.println(sender.getUsername() + " has composed this offer with ID: " + offerSelected.getOfferID());
	}

	public void updateOnInterestedParty(Private sender,String update) {
		System.out.print(sender.getUsername() + " is interested in Offer and said: " + update);
	}

}
	