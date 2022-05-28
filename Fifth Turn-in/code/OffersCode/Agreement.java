import java.time.LocalDateTime;

public class Agreement {
	
	private Boolean haveAgreed;
	private float priceAgreed;
	private Ad adSelected;
	private LocalDateTime dateAgreed;
	private PropertyManager party; //μηπως ειναι καλυτερα να εχουμε sending και receiving party?
	
	public Agreement(Boolean haveAgreed, float priceAgreed, Ad adSelected, LocalDateTime dateAgreed) {
		this.dateAgreed = dateAgreed;
		this.priceAgreed = priceAgreed;
		this.adSelected = adSelected;
		this.priceAgreed = priceAgreed;
	}
	
	public Boolean checkForAgreement() {
		
	}
	
	public void mentionOnAgreement() {
		
	}